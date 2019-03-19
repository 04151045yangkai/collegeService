package com.how2java.mapper;


import com.kai.collegeservice.pojo.Birthplace;

public interface BirthplaceMapper {
    int insert(Birthplace record);

    int insertSelective(Birthplace record);
}