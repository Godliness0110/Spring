package com.hzw.proxy.cglib;

/**
 * @author Godliness
 * @date 2021/10/15 11:00
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
