package com.mg.multithreading.config;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.stereotype.Component;

import java.util.concurrent.*;

@Component
public class ThreadPoolManager {
    private static final int THREAD_POOL_SIZE = 10; // Adjust the size as needed
    private static ExecutorService executorService;

    public ThreadPoolManager() {
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
        threadFactoryBuilder.setNameFormat("rpc-pool-%d");
        threadFactoryBuilder.setUncaughtExceptionHandler((t, e) -> e.printStackTrace());

        ThreadFactory factory = threadFactoryBuilder.build();
        executorService = new ThreadPoolExecutor(THREAD_POOL_SIZE,20,30L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5000),factory,new ThreadPoolExecutor.AbortPolicy());
    }

    public void submitTask(Runnable runnable){
        executorService.submit(runnable);
    }
}
