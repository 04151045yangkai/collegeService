package com.how2java.mapper;


import com.how2java.pojo.SkillCertificate;

public interface SkillCertificateMapper {
    int deleteByPrimaryKey(Integer scid);

    int insert(SkillCertificate record);

    int insertSelective(SkillCertificate record);

    SkillCertificate selectByPrimaryKey(Integer scid);

    int updateByPrimaryKeySelective(SkillCertificate record);

    int updateByPrimaryKey(SkillCertificate record);
}