package com.xzq.consumer.controller;

import com.xzq.client.XzqRpcService;
import com.xzq.ioc.annotation.XrpcAutowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiongzq
 * @since 2025-06-05 9:55
 **/
@RestController
public class TestController {


    @XrpcAutowired
    private XzqRpcService xzqRpcService;

    @GetMapping("/sayhello/{name}")
    public String sayHello(@PathVariable String name) {
        return xzqRpcService.sayHello(name);
    }
}
