package com.atguigu.springcloud.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.atguigu.springcloud.dao.BookDao.update())")
    private void pt() {
    }

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }

    @Around("execution(void com.atguigu.springcloud.dao.BookDao.save())")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前：");

        Signature signature = joinPoint.getSignature();
        System.out.println("signature: " + signature);
        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
