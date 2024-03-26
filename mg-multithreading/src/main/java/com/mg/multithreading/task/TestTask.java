package com.mg.multithreading.task;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestTask implements Runnable {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final String xxx;

    // 可以传接口进来
    public TestTask(String xxx) {
        this.xxx = xxx;
    }

    @Override
    public void run() {
        log.info(xxx);
    }
}
