package com.atguigu.springcloud.dao.impl;

import com.atguigu.springcloud.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void update() {
        System.out.print("book dao update");
    }
    @Override
    public void save() {
        System.out.print("book dao save");
    }
}

