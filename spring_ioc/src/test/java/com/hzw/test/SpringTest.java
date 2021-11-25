package com.hzw.test;

import com.hzw.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Godliness
 * @date 2021/9/27 19:42
 * @Description
 */
public class SpringTest {
    @Test
    /**
     * 测试scope属性
     */
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
    }
}
