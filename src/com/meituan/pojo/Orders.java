package com.meituan.pojo;

import java.util.Date;

public class Orders {
    private String oId;

    private String uId;

    private Double oMoney;

    private Double oOrderprice;

    private String oPaymentstate;

    private String oShopstate;

    private String bId;

    private String adEndid;

    private String oRemark;

    private Date oSendtime;

    private Date oOpentime;

    private Date oFinishtime;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public Double getoMoney() {
        return oMoney;
    }

    public void setoMoney(Double oMoney) {
        this.oMoney = oMoney;
    }

    public Double getoOrderprice() {
        return oOrderprice;
    }

    public void setoOrderprice(Double oOrderprice) {
        this.oOrderprice = oOrderprice;
    }

    public String getoPaymentstate() {
        return oPaymentstate;
    }

    public void setoPaymentstate(String oPaymentstate) {
        this.oPaymentstate = oPaymentstate == null ? null : oPaymentstate.trim();
    }

    public String getoShopstate() {
        return oShopstate;
    }

    public void setoShopstate(String oShopstate) {
        this.oShopstate = oShopstate == null ? null : oShopstate.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getAdEndid() {
        return adEndid;
    }

    public void setAdEndid(String adEndid) {
        this.adEndid = adEndid == null ? null : adEndid.trim();
    }

    public String getoRemark() {
        return oRemark;
    }

    public void setoRemark(String oRemark) {
        this.oRemark = oRemark == null ? null : oRemark.trim();
    }

    public Date getoSendtime() {
        return oSendtime;
    }

    public void setoSendtime(Date oSendtime) {
        this.oSendtime = oSendtime;
    }

    public Date getoOpentime() {
        return oOpentime;
    }

    public void setoOpentime(Date oOpentime) {
        this.oOpentime = oOpentime;
    }

    public Date getoFinishtime() {
        return oFinishtime;
    }

    public void setoFinishtime(Date oFinishtime) {
        this.oFinishtime = oFinishtime;
    }
}