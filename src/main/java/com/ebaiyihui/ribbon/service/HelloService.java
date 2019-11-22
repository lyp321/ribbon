package com.ebaiyihui.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: ribbon
 * @description: 测试ribbon负载均衡
 * @author: Liyp
 * @create: 2019-11-22 11:52
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name,String.class);
    }
}