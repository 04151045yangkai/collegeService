package com.how2java.controller;


import com.how2java.pojo.Login;
import com.how2java.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class LoginController {

    public LoginService ls;

    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String loginUser(Login user, HttpSession session){
        //调用Service方法
        user =  ls.login(String.valueOf(user.getUserID()),user.getPassword(),user.getUserFlag());

        if (user != null){
            session.setAttribute("u",user);
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        session.invalidate();
        return "login";

    }


}
