package com.hzw.domain;

import java.util.Date;

/**
 * @author Godliness
 * @date 2021/10/18 15:37
 * @Description
 */
public class Order {
    private int id;
    private Date ordertime;
    private double total;
    //当前订单属于哪个对象
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return ordertime;
    }

    public void setDate(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + ordertime +
                ", total=" + total +
                ", user=" + user +
                '}';
    }
}
