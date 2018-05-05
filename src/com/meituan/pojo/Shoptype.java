package com.meituan.pojo;

public class Shoptype {
    private String shoptypeId;

    private String shoptype;

    public String getShoptypeId() {
        return shoptypeId;
    }

    public void setShoptypeId(String shoptypeId) {
        this.shoptypeId = shoptypeId == null ? null : shoptypeId.trim();
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }
}