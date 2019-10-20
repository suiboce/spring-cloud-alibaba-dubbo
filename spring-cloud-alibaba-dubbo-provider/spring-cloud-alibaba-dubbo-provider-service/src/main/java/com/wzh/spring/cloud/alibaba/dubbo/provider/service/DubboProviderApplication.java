package com.wzh.spring.cloud.alibaba.dubbo.provider.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wzh
 * @date 2019/10/17 - 10:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class,args);
    }
}
