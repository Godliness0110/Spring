package com.hzw.proxy.jdk;

/**
 * @author Godliness
 * @date 2021/10/15 10:28
 * @Description
 */
public class Advice {
    public void before(){
        System.out.println("前置增强...");
    }
    public void afterReturning(){
        System.out.println("后置增强...");
    }
}
