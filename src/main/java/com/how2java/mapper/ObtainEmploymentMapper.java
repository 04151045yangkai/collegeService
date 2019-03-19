package com.how2java.mapper;


import com.how2java.pojo.ObtainEmployment;

public interface ObtainEmploymentMapper {
    int insert(ObtainEmployment record);

    int insertSelective(ObtainEmployment record);
}