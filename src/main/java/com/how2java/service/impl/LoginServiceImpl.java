package com.how2java.service.impl;

import com.how2java.mapper.LoginMapper;
import com.how2java.pojo.Login;
import com.how2java.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {

    @Autowired
    public LoginMapper lm;

    @Override
    public Login login(String userId, String password,int userFlag) {
        Login user = lm.login(userId,password,userFlag);
        if (user != null && user.getPassword().equals(password) && user.getUserFlag().equals(userFlag))
        {
            return user;
        }
        return null;
    }
}
