package com.meituan.pojo;

public class Bussiness {
    private String bId;

    private String sId;

    private String bShopname;

    private String bShoplogo;

    private String bNotice;

    private Integer bIsban;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
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

    public Integer getbIsban() {
        return bIsban;
    }

    public void setbIsban(Integer bIsban) {
        this.bIsban = bIsban;
    }
}