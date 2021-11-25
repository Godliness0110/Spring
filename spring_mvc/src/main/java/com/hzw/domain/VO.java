package com.hzw.domain;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/12 19:43
 * @Description
 */
public class VO {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
