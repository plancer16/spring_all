package com.atguigu.springcloud.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.atguigu.springcloud")
@EnableAspectJAutoProxy
public class SpringConfig {
}
