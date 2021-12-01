package com.hzw.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Godliness
 * @date 2021/10/15 17:46
 * @Description
 */
public class MyAspect {
    public void before(){
        System.out.println("前置增强...");
    }
    public void afterReturning(){
        System.out.println("后置增强...");
    }
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
        Object proceed = pjp.proceed();//启动目标方法执行
        System.out.println("环绕后增强...");
        return proceed;
    }
    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }
    public void after(){
        System.out.println("最终增强...");
    }
}
