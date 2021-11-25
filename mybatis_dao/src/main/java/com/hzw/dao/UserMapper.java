package com.hzw.dao;

import com.hzw.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/17 15:25
 * @Description
 */
public interface UserMapper {
    public List<User> findAll() throws IOException;
    public User findById(int id);
}
