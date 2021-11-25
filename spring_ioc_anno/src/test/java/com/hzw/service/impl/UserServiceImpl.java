package com.hzw.service.impl;

import com.hzw.dao.UserDao;
import com.hzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author Godliness
 * @date 2021/10/11 17:26
 * @Description
 */
//<bean id="userService" class="com.hzw.service.impl.UserServiceImpl">
//    @Component("userService")
@Repository("UserService")
@Scope("singleton")
public class UserServiceImpl implements UserService {
    @Value("${jdbc.driver}")
    private String driver;
//<property name="userDao" ref="userDao"></property>
    //@Autowired//按照你的数据类型从Spring容器中进行匹配的
    //@Qualifier("userDao")//bean的注入，是按照id值从容器中进行匹配的，但是主要此处@Qualifier结合@Autowired一起使用
    @Resource(name = "userDao")//相当于@Qualifier结合@Autowired
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void save() {
        userDao.save();
        System.out.println(driver);
    }


    @PostConstruct
    public void init(){
        System.out.println("Service对象初始化。。。");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Service对象销毁。。。");
    }
}
