package com.shopone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
    @RequestMapping("/detail")
    public String detail(){
        return "detail";
    }
    //登录
    @RequestMapping("loginpage")
    public String loginpage(){
        return "loginpage";
    }
    //售后方面的
    @RequestMapping("publics")
    public String publics(){
        return "public";
    }
    //注册
    @RequestMapping("registerpage")
    public String registerpage(){
        return "registerpage";
    }
    //搜索
    @RequestMapping("searchList")
    public String searchList(){
        return "searchList";
    }
}
