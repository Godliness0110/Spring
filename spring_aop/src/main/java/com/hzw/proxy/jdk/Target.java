package com.hzw.proxy.jdk;

/**
 * @author Godliness
 * @date 2021/10/15 10:29
 * @Description
 */
public class Target implements TargetInterface{
    @Override
    public void save() {
        System.out.println("save running...");
    }
}
