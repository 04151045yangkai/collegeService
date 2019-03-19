package com.how2java.mapper;


import com.how2java.pojo.EmploymentInfo;

public interface EmploymentInfoMapper {
    int insert(EmploymentInfo record);

    int insertSelective(EmploymentInfo record);
}