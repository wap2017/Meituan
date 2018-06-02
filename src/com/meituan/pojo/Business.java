package com.meituan.pojo;

import java.util.Date;

public class Business {
    private String bId;

    private String bShopname;

    private String bShoplogo;

    private String bNotice;

    private String bAccountid;

    private String bAccountpassword;

    private Float bCommission;

    private Integer bIsban;

    private String sType;

    private String sStatetype;

    private String sTelephone;

    private String sResponsible;

    private String sRphone;

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

    
    
    @Override
	public String toString() {
		return "Business [bId=" + bId + ", bShopname=" + bShopname + ", bShoplogo=" + bShoplogo + ", bNotice=" + bNotice
				+ ", bAccountid=" + bAccountid + ", bAccountpassword=" + bAccountpassword + ", bCommission="
				+ bCommission + ", bIsban=" + bIsban + ", sType=" + sType + ", sStatetype=" + sStatetype
				+ ", sTelephone=" + sTelephone + ", sResponsible=" + sResponsible + ", sRphone=" + sRphone
				+ ", sProvince=" + sProvince + ", sCity=" + sCity + ", sSchool=" + sSchool + ", sAddress=" + sAddress
				+ ", sIdcardpos=" + sIdcardpos + ", sIdcardback=" + sIdcardback + ", sLicense=" + sLicense
				+ ", sHygiene=" + sHygiene + ", sApply=" + sApply + ", sHours=" + sHours + ", sNotreason=" + sNotreason
				+ "]";
	}

	public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getbShopname() {
        return bShopname;
    }

    public void setbShopname(String bShopname) {
        this.bShopname = bShopname == null ? null : bShopname.trim();
    }

    public String getbShoplogo() {
        return bShoplogo;
    }

    public void setbShoplogo(String bShoplogo) {
        this.bShoplogo = bShoplogo == null ? null : bShoplogo.trim();
    }

    public String getbNotice() {
        return bNotice;
    }

    public void setbNotice(String bNotice) {
        this.bNotice = bNotice == null ? null : bNotice.trim();
    }

    public String getbAccountid() {
        return bAccountid;
    }

    public void setbAccountid(String bAccountid) {
        this.bAccountid = bAccountid == null ? null : bAccountid.trim();
    }

    public String getbAccountpassword() {
        return bAccountpassword;
    }

    public void setbAccountpassword(String bAccountpassword) {
        this.bAccountpassword = bAccountpassword == null ? null : bAccountpassword.trim();
    }

    public Float getbCommission() {
        return bCommission;
    }

    public void setbCommission(Float bCommission) {
        this.bCommission = bCommission;
    }

    public Integer getbIsban() {
        return bIsban;
    }

    public void setbIsban(Integer bIsban) {
        this.bIsban = bIsban;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType == null ? null : sType.trim();
    }

    public String getsStatetype() {
        return sStatetype;
    }

    public void setsStatetype(String sStatetype) {
        this.sStatetype = sStatetype == null ? null : sStatetype.trim();
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

    public String getsRphone() {
        return sRphone;
    }

    public void setsRphone(String sRphone) {
        this.sRphone = sRphone == null ? null : sRphone.trim();
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