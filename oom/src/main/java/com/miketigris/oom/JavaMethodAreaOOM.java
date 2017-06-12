package com.miketigris.oom;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2017/6/12.
 * 实验了好几遍都没有实现方法去内存溢出，可能跟1.8版本有关系，书上都是1.6和1.7的例子
 */
public class JavaMethodAreaOOM  implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> proxy.invokeSuper(obj, args));
            enhancer.create();
        }
    }

    static class OOMObject {
    }
}
