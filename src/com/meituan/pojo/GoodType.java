package com.meituan.pojo;

public class GoodType {
    private String gType;

    private String bId;

    private String gTypename;

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType == null ? null : gType.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getgTypename() {
        return gTypename;
    }

    public void setgTypename(String gTypename) {
        this.gTypename = gTypename == null ? null : gTypename.trim();
    }
}