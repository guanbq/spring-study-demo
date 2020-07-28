package com.gbq.div;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Annotation {

    @Before("execution(* com.gbq.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("==方法执行前==");
    }

    @After("execution(* com.gbq.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("--方法执行后--");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.gbq.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前");

        // 执行方法
        Object o = pj.proceed();
        // pj有一些方法 获取执行方法的信息
        // System.out.println(pj.getSignature());

        System.out.println("环绕后");
    }
}
