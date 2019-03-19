package com.how2java.pojo;

public class Birthplace {
    private Integer birthid;

    private String birthpath;

    private String cityortownship;

    private String address;

    private Integer homephone;

    private Integer zipcode;

    private String issuballowance;

    public Integer getBirthid() {
        return birthid;
    }

    public void setBirthid(Integer birthid) {
        this.birthid = birthid;
    }

    public String getBirthpath() {
        return birthpath;
    }

    public void setBirthpath(String birthpath) {
        this.birthpath = birthpath == null ? null : birthpath.trim();
    }

    public String getCityortownship() {
        return cityortownship;
    }

    public void setCityortownship(String cityortownship) {
        this.cityortownship = cityortownship == null ? null : cityortownship.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getHomephone() {
        return homephone;
    }

    public void setHomephone(Integer homephone) {
        this.homephone = homephone;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getIssuballowance() {
        return issuballowance;
    }

    public void setIssuballowance(String issuballowance) {
        this.issuballowance = issuballowance == null ? null : issuballowance.trim();
    }
}