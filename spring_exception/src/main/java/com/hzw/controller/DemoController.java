package com.hzw.controller;

import com.hzw.exception.MyException;
import com.hzw.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileNotFoundException;

/**
 * @author Godliness
 * @date 2021/10/14 19:38
 * @Description
 */
@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/show")
    public String show(@RequestParam(value = "name",required = true)String name) throws FileNotFoundException, MyException {
        System.out.println("show running...");
        demoService.show1();
//        demoService.show2();
//        demoService.show3();
//        demoService.show4();
//        demoService.show5();
        return "index";
    }
}
