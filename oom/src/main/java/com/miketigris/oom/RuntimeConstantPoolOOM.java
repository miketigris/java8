package com.miketigris.oom;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 * VM Args:-XX:PermSize=10M --XX:MaxPermSize=10M
 */
public class RuntimeConstantPoolOOM implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        List<String> list =new ArrayList();
        int i=0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
