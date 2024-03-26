package com.mg.multithreading;

import com.mg.multithreading.config.ThreadPoolManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Arrays;

/**
 * Hello world!
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Slf4j
public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(Application.class, args);
    }
}
