package com.wzy.dao;

import com.wzy.javabean.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//Dao接口测试
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
