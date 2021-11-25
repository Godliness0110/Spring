package com.hzw.factory;

import com.hzw.dao.UserDao;
import com.hzw.dao.impl.UserDaoImpl;

/**
 * @author Godliness
 * @date 2021/9/28 14:13
 * @Description
 */
public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
