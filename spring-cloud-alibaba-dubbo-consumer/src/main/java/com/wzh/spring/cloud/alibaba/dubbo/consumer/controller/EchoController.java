package com.wzh.spring.cloud.alibaba.dubbo.consumer.controller;

import com.wzh.spring.cloud.alibaba.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzh
 * @date 2019/10/17 - 14:15
 */
@RestController
public class EchoController {
    @Reference(version = "1.0.0")
    EchoService echoService;
    @GetMapping("echo/{str}")
    public String echo(@PathVariable String str){
        return echoService.echo(str);
    }
}
