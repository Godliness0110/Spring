package com.hzw.mapper;

import com.hzw.domain.Account;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/18 20:07
 * @Description
 */
public interface AccountMapper {

    public void save(Account account);


    public List<Account> findAll();
}
