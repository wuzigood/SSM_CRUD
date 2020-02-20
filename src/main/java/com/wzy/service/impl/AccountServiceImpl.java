package com.wzy.service.impl;

import com.wzy.dao.AccountDao;
import com.wzy.javabean.Account;
import com.wzy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层查询所有");
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("业务层添加账户");
        accountDao.saveAccount(account);
    }
}
