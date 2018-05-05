package com.meituan.pojo;

import java.util.Date;

public class Purchase {
    private String pId;

    private String uId;

    private String pState;

    private String pAddressid;

    private String bId;

    private String pOrderremark;

    private Date pCanceltime;

    private Date pOpentime;

    private Date pReceivetime;

    private Date pFinishtime;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState == null ? null : pState.trim();
    }

    public String getpAddressid() {
        return pAddressid;
    }

    public void setpAddressid(String pAddressid) {
        this.pAddressid = pAddressid == null ? null : pAddressid.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getpOrderremark() {
        return pOrderremark;
    }

    public void setpOrderremark(String pOrderremark) {
        this.pOrderremark = pOrderremark == null ? null : pOrderremark.trim();
    }

    public Date getpCanceltime() {
        return pCanceltime;
    }

    public void setpCanceltime(Date pCanceltime) {
        this.pCanceltime = pCanceltime;
    }

    public Date getpOpentime() {
        return pOpentime;
    }

    public void setpOpentime(Date pOpentime) {
        this.pOpentime = pOpentime;
    }

    public Date getpReceivetime() {
        return pReceivetime;
    }

    public void setpReceivetime(Date pReceivetime) {
        this.pReceivetime = pReceivetime;
    }

    public Date getpFinishtime() {
        return pFinishtime;
    }

    public void setpFinishtime(Date pFinishtime) {
        this.pFinishtime = pFinishtime;
    }
}