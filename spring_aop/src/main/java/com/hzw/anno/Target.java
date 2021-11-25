package com.hzw.anno;


import org.springframework.stereotype.Component;

/**
 * @author Godliness
 * @date 2021/10/16 12:03
 * @Description
 */
@Component("target")
public class Target implements TargetInterface{
    public void save(){
        System.out.println("save running...");
    }
}
