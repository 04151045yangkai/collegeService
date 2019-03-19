package com.how2java.mapper;


import com.how2java.pojo.PoorStudentCard;

public interface PoorStudentCardMapper {
    int insert(PoorStudentCard record);

    int insertSelective(PoorStudentCard record);
}