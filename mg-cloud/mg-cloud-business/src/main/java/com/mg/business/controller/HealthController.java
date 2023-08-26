package com.mg.business.controller;

import com.mg.business.client.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Magi
 * @Date 2023/8/26 22:48
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("/health")
@Slf4j
// nacos配置自动更新（热更新）
@RefreshScope
public class HealthController {

    @Value("${flag}")
    private String flag;
    @Value("${server.port}")
    private String port;

    @Autowired
    private UserClient userClient;

    @GetMapping("/flag")
    public String flag(String params) {
        return String.join(":", flag, port, params);
    }

    @GetMapping("/userFlag")
    public String userFlag(String params) {
        return userClient.userFlag(params);
    }
}
