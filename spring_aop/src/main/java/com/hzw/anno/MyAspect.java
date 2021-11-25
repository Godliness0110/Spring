package com.hzw.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Godliness
 * @date 2021/10/15 17:46
 * @Description
 */
@Component("myAspect")
@Aspect//标注只是一个切面类
public class MyAspect {
    //配置前置通知
//    @Before("execution(* com.hzw.anno.*.*(..))")
    public void before(){
        System.out.println("前置增强...");
    }
    public void afterReturning(){
        System.out.println("后置增强...");
    }
//    @Around("execution(* com.hzw.anno.*.*(..))")
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强...");
        return proceed;
    }
    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }
    public void after(){
        System.out.println("最终增强...");
    }

    //定义一个切点表达式
    @Pointcut("execution(* com.hzw.anno.*.*(..))")
    public void pointcut(){

    }
}
