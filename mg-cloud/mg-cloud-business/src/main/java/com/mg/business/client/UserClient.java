package com.mg.business.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Magi
 * @Date 2023/8/26 23:53
 * @Version 1.0
 * @Description
 */
// 远程调用的服务名
@FeignClient("cloudUser")
public interface UserClient {

    @GetMapping("/health/flag")
    String userFlag(@RequestParam("params") String params);
}
