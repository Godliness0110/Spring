package com.hzw.domain;

import java.util.Date;
import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/17 21:29
 * @Description
 */
public class User {
    private int id;
    private String username;
    private String password;
    private Date birthday;

    //描述的是当前用户存在哪些订单
    private List<Order> orderList;
    //描述的是当前用户存在哪些角色
    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return birthday;
    }

    public void setDate(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", orderList=" + orderList +
                ", roleList=" + roleList +
                '}';
    }
}
