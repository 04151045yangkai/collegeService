package com.how2java.service;

import com.how2java.pojo.Login;

public interface LoginService {

    //用户登录
    Login login(String  userId, String password,int userFlag);

}
