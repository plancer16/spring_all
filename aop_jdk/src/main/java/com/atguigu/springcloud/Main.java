package com.atguigu.springcloud;

import com.atguigu.springcloud.impl.DaoProxy;
import com.atguigu.springcloud.impl.HelloServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl(); // 类实现了接口
        InvocationHandler handler = new DaoProxy(helloService); // 类作为参数，生成invovation handler
        HelloService proxy = (HelloService) Proxy.newProxyInstance( // 生成代理对象
                helloService.getClass().getClassLoader(),
                helloService.getClass().getInterfaces(),
                handler
        );
        proxy.sayHello();
    }
}