package com.hzw.factory;

import com.hzw.dao.UserDao;
import com.hzw.dao.impl.UserDaoImpl;

/**
 * @author Godliness
 * @date 2021/9/28 14:17
 * @Description
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
