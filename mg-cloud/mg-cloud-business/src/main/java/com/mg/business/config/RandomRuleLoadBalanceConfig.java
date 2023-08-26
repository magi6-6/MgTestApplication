package com.mg.business.config;

import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Magi
 * @Date 2023/8/27 0:44
 * @Version 1.0
 * @Description
 */
@Configuration
// 指定Ribbon规则
@RibbonClient(value = "cloudUser", configuration = RandomRule.class)
public class RandomRuleLoadBalanceConfig {
}
