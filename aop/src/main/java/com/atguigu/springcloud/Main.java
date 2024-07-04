package com.atguigu.springcloud;

import com.atguigu.springcloud.config.SpringConfig;
import com.atguigu.springcloud.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.update();

        bookDao.save();
    }
}