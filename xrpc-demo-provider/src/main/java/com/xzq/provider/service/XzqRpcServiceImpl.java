package com.xzq.provider.service;

import com.xzq.client.XzqRpcService;
import com.xzq.ioc.annotation.XrpcService;
import org.springframework.stereotype.Service;

/**
 * @author xiongzq
 * @since 2025-06-05 9:52
 **/
@XrpcService
@Service
public class XzqRpcServiceImpl implements XzqRpcService {

    @Override
    public String sayHello(String name) {
        return name + " say hello!!!";
    }
}
