package com.how2java.mapper;


import com.kai.collegeservice.pojo.Poorstudentcard;

public interface PoorstudentcardMapper {
    int insert(Poorstudentcard record);

    int insertSelective(Poorstudentcard record);
}