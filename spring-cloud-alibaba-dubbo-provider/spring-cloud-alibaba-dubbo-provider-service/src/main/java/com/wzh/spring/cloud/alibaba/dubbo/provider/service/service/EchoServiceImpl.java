package com.wzh.spring.cloud.alibaba.dubbo.provider.service.service;

import com.wzh.spring.cloud.alibaba.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author wzh
 * @date 2019/10/17 - 10:15
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Value("${port}")
    String port;
    @Override
    public String echo(String str) {
        return "echo haha "+port;
    }
}
