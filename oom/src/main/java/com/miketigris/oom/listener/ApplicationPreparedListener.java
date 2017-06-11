package com.miketigris.oom.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2017/6/12.
 */
@Slf4j
public class ApplicationPreparedListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        log.info("ApplicationPreparedListener----------------------------");
    }
}
