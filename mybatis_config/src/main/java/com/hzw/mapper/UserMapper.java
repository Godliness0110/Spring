package com.hzw.mapper;

import com.hzw.domain.User;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/17 20:17
 * @Description
 */
public interface UserMapper {
    public void save(User user);
    public User findById(int id);
    public List<User> findAll();
}
