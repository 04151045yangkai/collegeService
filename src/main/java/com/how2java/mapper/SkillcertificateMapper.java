package com.how2java.mapper;


import com.kai.collegeservice.pojo.Skillcertificate;

public interface SkillcertificateMapper {
    int deleteByPrimaryKey(Integer scid);

    int insert(Skillcertificate record);

    int insertSelective(Skillcertificate record);

    Skillcertificate selectByPrimaryKey(Integer scid);

    int updateByPrimaryKeySelective(Skillcertificate record);

    int updateByPrimaryKey(Skillcertificate record);
}