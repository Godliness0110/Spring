package com.hzw.mapper;

import com.hzw.domain.User;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/17 16:12
 * @Description
 */
public interface UserMapper {
    public List<User> findByCondition(User user);
    public List<User> findByIds(List<Integer> ids);
}
