package com.meituan.pojo;

import java.util.Date;

public class Goods {
    private String gId;

    private String bId;

    private String gName;

    private String gDetail;

    private String gType;

    private Double gPrice;

    private Integer gStock;

    private String gPicture;

    private Integer gSale;

    private Date gAdd;

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId == null ? null : gId.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getgDetail() {
        return gDetail;
    }

    public void setgDetail(String gDetail) {
        this.gDetail = gDetail == null ? null : gDetail.trim();
    }

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType == null ? null : gType.trim();
    }

    public Double getgPrice() {
        return gPrice;
    }

    public void setgPrice(Double gPrice) {
        this.gPrice = gPrice;
    }

    public Integer getgStock() {
        return gStock;
    }

    public void setgStock(Integer gStock) {
        this.gStock = gStock;
    }

    public String getgPicture() {
        return gPicture;
    }

    public void setgPicture(String gPicture) {
        this.gPicture = gPicture == null ? null : gPicture.trim();
    }

    public Integer getgSale() {
        return gSale;
    }

    public void setgSale(Integer gSale) {
        this.gSale = gSale;
    }

    public Date getgAdd() {
        return gAdd;
    }

    public void setgAdd(Date gAdd) {
        this.gAdd = gAdd;
    }
}