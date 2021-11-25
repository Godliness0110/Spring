package com.hzw.mapper;

import com.hzw.domain.User;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/17 21:32
 * @Description
 */
public interface UserMapper {
    public List<User> findAll();

    public List<User> findUserAndRoleAll();
}
