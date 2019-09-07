package org.lee.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.lee.dubbo.api.SayHelloService;

@Service(version = "1.0.0")
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String sayHello(String name) {
        return "provider: " + name;
    }
}
