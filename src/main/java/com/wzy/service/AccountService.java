package com.wzy.service;

import com.wzy.javabean.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();

    public void saveAccount(Account account);
}
