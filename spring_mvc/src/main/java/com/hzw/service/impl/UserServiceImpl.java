package com.hzw.service.impl;

import com.hzw.dao.UserDao;
import com.hzw.service.UserService;

/**
 * @author Godliness
 * @date 2021/10/11 21:45
 * @Description
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save(){
        userDao.save();
    }
}
