package com.hzw.dao.impl;

import com.hzw.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Godliness
 * @date 2021/10/11 17:22
 * @Description
 */
//<bean id="userDao" class="com.hzw.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")
    @Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running...");

    }
}
