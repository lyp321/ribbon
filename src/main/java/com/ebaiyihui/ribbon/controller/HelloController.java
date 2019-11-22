package com.ebaiyihui.ribbon.controller;

import com.ebaiyihui.ribbon.service.HelloService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ribbon
 * @description: 测试控制层
 * @author: Liyp
 * @create: 2019-11-22 14:00
 **/
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}