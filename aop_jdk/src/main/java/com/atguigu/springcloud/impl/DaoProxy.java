package com.atguigu.springcloud.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DaoProxy implements InvocationHandler {

    private final Object target;

    public DaoProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        Object result = method.invoke(target, args);
        System.out.println("after invoke");
        return result;
    }
}
