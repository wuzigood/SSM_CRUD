package com.wzy.dao;

import com.wzy.javabean.Account;

import java.util.List;

//Dao接口测试
public interface AccountDao {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
