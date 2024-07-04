package com.atguigu.springcloud.dao;

public class Dao {
    public void update() {
        System.out.println("PeopleDao.update()");
    }

    public void select() {
        System.out.println("PeopleDao.select()");
    }
}
/**
 * 1、有一个类有若干方法
 * 2、代理类实现MethodInterceptor，重写intercept方法
 * 3、enhancer关联父类和代理类
 * 4、enhancer创建父类的子类，执行方法
 */