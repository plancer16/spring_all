package com.atguigu.springcloud;

import com.atguigu.springcloud.dao.Dao;
import com.atguigu.springcloud.dao.DaoProxy;
import org.springframework.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        DaoProxy daoProxy = new DaoProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallback(daoProxy);

        Dao dao = (Dao)enhancer.create();
        dao.update();
        //dao.select();
    }
}