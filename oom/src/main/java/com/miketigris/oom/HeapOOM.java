package com.miketigris.oom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mike.xu on 2017/6/6.
 * 堆内存溢出引起的OOM
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 如果打印日志放开，则会一直打印不OOM
 * 关注两个概念：内存泄漏（Memory Leak）和内存溢出（Memory Overflow）
 * http://blog.csdn.net/wisgood/article/details/16818243
 */
@Slf4j
public class HeapOOM implements ApplicationListener<ApplicationReadyEvent> {

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
       // log.info("ApplicationStartingEvent start");
//        List<OOMObject> list = new ArrayList();
//        while (true) {
//            //log.info("list size = "+list.size());
//            list.add(new OOMObject());
//        }
    }

    static class OOMObject {

    }
}
