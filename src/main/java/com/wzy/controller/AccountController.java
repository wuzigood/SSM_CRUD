package com.wzy.controller;

import com.wzy.javabean.Account;
import com.wzy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    //依赖注入
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有");
        //调用业务层
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

}
