package com.mg.multithreading;

import com.mg.multithreading.config.ThreadPoolManager;
import com.mg.multithreading.task.TestTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class AppTest {

    @Autowired
    private ThreadPoolManager threadPoolManager;
    @Test
    public void testThread() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log.info(">>> run--------------------------------------");
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    throw new RuntimeException("123456");
                }
            }
        };
        for (int i = 0; i < 30; i++) {
            threadPoolManager.submitTask(new TestTask("test!"));
//            runnable.run();
        }
        try {
            Thread.sleep(1000000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
