package com.miketigris.oom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2017/6/12.
 * VM Args: -Xss128k
 */
@Slf4j
public class JavaVMStackSOF implements ApplicationListener<ApplicationReadyEvent> {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        JavaVMStackSOF stackSOF =  new JavaVMStackSOF();
             try{
                 stackSOF.stackLeak();
             }catch (Throwable e){
                 log.info("stack length :"+stackSOF.stackLength);
             }

    }
}
