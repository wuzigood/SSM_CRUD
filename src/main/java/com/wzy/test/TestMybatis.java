package com.wzy.test;

import com.wzy.dao.AccountDao;
import com.wzy.javabean.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void test() throws Exception {
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //创建SqlSession对象
        SqlSession session = factory.openSession();

        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        //查询所有信息
        List<Account> list = dao.findAll();
        for(Account ac:list){
            System.out.println(ac);
        }

        //关闭资源
        session.close();
        is.close();
    }
    @Test
    public void test2() throws Exception {
        Account ac = new Account();
        ac.setName("tom");
        ac.setMoney(1234d);
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //创建SqlSession对象
        SqlSession session = factory.openSession();

        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        //保存方法
        dao.saveAccount(ac);

        //增删改都需要自己提交事务
        session.commit();

        //关闭资源
        session.close();
        is.close();


    }
}
