package com.meituan.pojo;

import java.util.Date;

public class Identification {
    private String sId;

    private String sType;

    private String sStateid;

    private String sTelephone;

    private String sResponsible;

    private String sProvince;

    private String sCity;

    private String sSchool;

    private String sAddress;

    private String sIdcardpos;

    private String sIdcardback;

    private String sLicense;

    private String sHygiene;

    private Date sApply;

    private String sHours;

    private String sNotreason;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType == null ? null : sType.trim();
    }

    public String getsStateid() {
        return sStateid;
    }

    public void setsStateid(String sStateid) {
        this.sStateid = sStateid == null ? null : sStateid.trim();
    }

    public String getsTelephone() {
        return sTelephone;
    }

    public void setsTelephone(String sTelephone) {
        this.sTelephone = sTelephone == null ? null : sTelephone.trim();
    }

    public String getsResponsible() {
        return sResponsible;
    }

    public void setsResponsible(String sResponsible) {
        this.sResponsible = sResponsible == null ? null : sResponsible.trim();
    }

    public String getsProvince() {
        return sProvince;
    }

    public void setsProvince(String sProvince) {
        this.sProvince = sProvince == null ? null : sProvince.trim();
    }

    public String getsCity() {
        return sCity;
    }

    public void setsCity(String sCity) {
        this.sCity = sCity == null ? null : sCity.trim();
    }

    public String getsSchool() {
        return sSchool;
    }

    public void setsSchool(String sSchool) {
        this.sSchool = sSchool == null ? null : sSchool.trim();
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getsIdcardpos() {
        return sIdcardpos;
    }

    public void setsIdcardpos(String sIdcardpos) {
        this.sIdcardpos = sIdcardpos == null ? null : sIdcardpos.trim();
    }

    public String getsIdcardback() {
        return sIdcardback;
    }

    public void setsIdcardback(String sIdcardback) {
        this.sIdcardback = sIdcardback == null ? null : sIdcardback.trim();
    }

    public String getsLicense() {
        return sLicense;
    }

    public void setsLicense(String sLicense) {
        this.sLicense = sLicense == null ? null : sLicense.trim();
    }

    public String getsHygiene() {
        return sHygiene;
    }

    public void setsHygiene(String sHygiene) {
        this.sHygiene = sHygiene == null ? null : sHygiene.trim();
    }

    public Date getsApply() {
        return sApply;
    }

    public void setsApply(Date sApply) {
        this.sApply = sApply;
    }

    public String getsHours() {
        return sHours;
    }

    public void setsHours(String sHours) {
        this.sHours = sHours == null ? null : sHours.trim();
    }

    public String getsNotreason() {
        return sNotreason;
    }

    public void setsNotreason(String sNotreason) {
        this.sNotreason = sNotreason == null ? null : sNotreason.trim();
    }
}