package com.hzw.service;

import com.hzw.domain.Account;

import java.util.List;

/**
 * @author Godliness
 * @date 2021/10/18 20:09
 * @Description
 */
public interface AccountService {

    public void save(Account account);

    public List<Account> findAll();
}
