package com.zys.boot_jeep.aspectj;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class isLogin {

    //匹配所有controller包下面的所有类的所有方法
    @Pointcut("execution(public * com.zys.boot_jeep.controller.*.*(..))")
    public void ifLogin(){}

    //所有请求查看是否登录
    @After("ifLogin()")
    public void isLogins(JoinPoint joinPoint){
        System.out.println(joinPoint);
    }
}
