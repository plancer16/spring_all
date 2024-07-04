package com.atguigu.springcloud.impl;

import com.atguigu.springcloud.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
