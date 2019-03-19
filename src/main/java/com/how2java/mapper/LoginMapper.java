package com.how2java.mapper;


import com.kai.collegeservice.pojo.Login;

public interface LoginMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}