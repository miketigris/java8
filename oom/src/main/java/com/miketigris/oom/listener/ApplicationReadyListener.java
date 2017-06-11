package com.miketigris.oom.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2017/6/12.
 */
@Slf4j
public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent>{
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        log.info("ApplicationReadyListener----------------------------");
    }
}
