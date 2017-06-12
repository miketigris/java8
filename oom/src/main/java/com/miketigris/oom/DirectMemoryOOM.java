package com.miketigris.oom;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import java.nio.ByteBuffer;

/**
 * Created by Administrator on 2017/6/12.
 */
public class DirectMemoryOOM  implements ApplicationListener<ApplicationReadyEvent> {

    private static final int _1MB = 1024 * 1024;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        ByteBuffer.allocateDirect(11*_1MB);
    }
}
