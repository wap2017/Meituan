package com.meituan.pojo;

public class Remainingsum {
    private String rsId;

    private String bId;

    private Double rsDepositmoney;

    private Double rsTotalmoney;

    public String getRsId() {
        return rsId;
    }

    public void setRsId(String rsId) {
        this.rsId = rsId == null ? null : rsId.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public Double getRsDepositmoney() {
        return rsDepositmoney;
    }

    public void setRsDepositmoney(Double rsDepositmoney) {
        this.rsDepositmoney = rsDepositmoney;
    }

    public Double getRsTotalmoney() {
        return rsTotalmoney;
    }

    public void setRsTotalmoney(Double rsTotalmoney) {
        this.rsTotalmoney = rsTotalmoney;
    }
}