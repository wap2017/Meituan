package com.meituan.pojo;

public class Address {
    private String adId;

    private String uId;

    private String adName;

    private String adPhone;

    private String adProvince;

    private String adCity;

    private String adAddress;

    private Integer adFlag;

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId == null ? null : adId.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getAdPhone() {
        return adPhone;
    }

    public void setAdPhone(String adPhone) {
        this.adPhone = adPhone == null ? null : adPhone.trim();
    }

    public String getAdProvince() {
        return adProvince;
    }

    public void setAdProvince(String adProvince) {
        this.adProvince = adProvince == null ? null : adProvince.trim();
    }

    public String getAdCity() {
        return adCity;
    }

    public void setAdCity(String adCity) {
        this.adCity = adCity == null ? null : adCity.trim();
    }

    public String getAdAddress() {
        return adAddress;
    }

    public void setAdAddress(String adAddress) {
        this.adAddress = adAddress == null ? null : adAddress.trim();
    }

    public Integer getAdFlag() {
        return adFlag;
    }

    public void setAdFlag(Integer adFlag) {
        this.adFlag = adFlag;
    }
}