package com.miketigris.oom;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2017/6/12.
 * VM Args: -Xss128k
 */
public class JavaVMStackSOF implements ApplicationListener<ApplicationReadyEvent> {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
               this.stackLeak();
    }
}
