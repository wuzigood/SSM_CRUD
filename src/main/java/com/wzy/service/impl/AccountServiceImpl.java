package com.wzy.service.impl;

import com.wzy.javabean.Account;
import com.wzy.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    public List<Account> findAll() {
        System.out.println("业务层查询所有");
        return null;
    }

    public void saveAccount(Account account) {
        System.out.println("业务层添加账户");

    }
}
