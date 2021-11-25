package com.hzw.aop;

/**
 * @author Godliness
 * @date 2021/10/15 17:45
 * @Description
 */
public class Target implements TargetInterface{
    @Override
    public void save() {
        System.out.println("save running...");
    }
}
