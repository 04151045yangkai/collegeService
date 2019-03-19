package com.how2java.pojo;

import java.util.Date;

public class Account {
    private String idcard;

    private Integer auserid;

    private String politics;

    private String nation;

    private String majorfield;

    private Date birthday;

    private String archivesinschool;

    private String rresidenceinschool;

    private String archivespath;

    private String rresidencepath;

    private Integer qqnum;

    private Integer phonenum;

    private String email;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Integer getAuserid() {
        return auserid;
    }

    public void setAuserid(Integer auserid) {
        this.auserid = auserid;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics == null ? null : politics.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getMajorfield() {
        return majorfield;
    }

    public void setMajorfield(String majorfield) {
        this.majorfield = majorfield == null ? null : majorfield.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getArchivesinschool() {
        return archivesinschool;
    }

    public void setArchivesinschool(String archivesinschool) {
        this.archivesinschool = archivesinschool == null ? null : archivesinschool.trim();
    }

    public String getRresidenceinschool() {
        return rresidenceinschool;
    }

    public void setRresidenceinschool(String rresidenceinschool) {
        this.rresidenceinschool = rresidenceinschool == null ? null : rresidenceinschool.trim();
    }

    public String getArchivespath() {
        return archivespath;
    }

    public void setArchivespath(String archivespath) {
        this.archivespath = archivespath == null ? null : archivespath.trim();
    }

    public String getRresidencepath() {
        return rresidencepath;
    }

    public void setRresidencepath(String rresidencepath) {
        this.rresidencepath = rresidencepath == null ? null : rresidencepath.trim();
    }

    public Integer getQqnum() {
        return qqnum;
    }

    public void setQqnum(Integer qqnum) {
        this.qqnum = qqnum;
    }

    public Integer getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Integer phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}