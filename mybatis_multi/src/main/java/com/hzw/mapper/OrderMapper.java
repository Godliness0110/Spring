package com.hzw.mapper;

import com.hzw.domain.Order;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/17 21:32
 * @Description
 */
public interface OrderMapper {
    public List<Order> findAll();
}
