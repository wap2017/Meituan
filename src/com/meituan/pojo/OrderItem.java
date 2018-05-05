package com.meituan.pojo;

public class OrderItem {
    private String oId;

    private String pId;

    private String gId;

    private Integer oNum;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId == null ? null : gId.trim();
    }

    public Integer getoNum() {
        return oNum;
    }

    public void setoNum(Integer oNum) {
        this.oNum = oNum;
    }
}