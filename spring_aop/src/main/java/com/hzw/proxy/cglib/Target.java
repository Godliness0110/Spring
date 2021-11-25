package com.hzw.proxy.cglib;

import com.hzw.proxy.jdk.TargetInterface;

/**
 * @author Godliness
 * @date 2021/10/15 10:29
 * @Description
 */
public class Target{
    public void save() {
        System.out.println("save running...");
    }
}
