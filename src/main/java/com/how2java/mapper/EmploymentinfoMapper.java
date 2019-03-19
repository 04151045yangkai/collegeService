package com.how2java.mapper;


import com.kai.collegeservice.pojo.Employmentinfo;

public interface EmploymentinfoMapper {
    int insert(Employmentinfo record);

    int insertSelective(Employmentinfo record);
}