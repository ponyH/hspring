package org.hxd.course06.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* org.hxd.course06.TestAop.add())")
    public void logBefore(){
        System.out.println("我是前置通知");
    }

    @After("execution(* org.hxd.course06.*.*(..))")
    public void logAfter(){
        System.out.println("我是后置通知");
    }
}