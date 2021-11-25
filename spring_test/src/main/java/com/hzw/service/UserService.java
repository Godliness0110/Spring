package com.hzw.service;

import com.hzw.domain.User;

import java.util.List;

public interface UserService {
    List<User> list();

    void save(User user, Long[] roleIds);

    void del(Long userId);

    public User login(String username, String password);

}
