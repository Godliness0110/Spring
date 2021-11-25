package com.hzw.service;

import com.hzw.exception.MyException;

import java.io.FileNotFoundException;

/**
 * @author Godliness
 * @date 2021/10/14 19:39
 * @Description
 */
public interface DemoService {
    void show1();

    void show2();

    void show3() throws FileNotFoundException;

    void show4();

    void show5() throws MyException;
}
