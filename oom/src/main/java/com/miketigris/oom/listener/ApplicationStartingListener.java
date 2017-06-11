package com.miketigris.oom.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2017/6/12.
 */
@Slf4j
public class ApplicationStartingListener implements ApplicationListener<ApplicationFailedEvent>{
    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        log.info("ApplicationStartingListener----------------------------");
    }
}
