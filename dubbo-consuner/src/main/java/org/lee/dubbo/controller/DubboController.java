package org.lee.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.lee.dubbo.api.SayHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class DubboController {

    @Reference(version="1.0.0")
    private SayHelloService dubboService;

    @RequestMapping("sayHello")
    @ResponseBody
    public String sayHello() {
        return dubboService.sayHello("consumer 请求服务");
    }
}
