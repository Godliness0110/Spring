package com.hzw.service.impl;

import com.hzw.dao.UserDao;
import com.hzw.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Godliness
 * @date 2021/9/28 14:23
 * @Description
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    //    public void setUserDao(UserDao userDao){
//        this.userDao = userDao;
//    }
    @Override
    public void save() {
        userDao.save();
    }
}
