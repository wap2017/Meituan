package com.meituan.pojo;

public class Feedback {
    private String fId;

    private String fReceiveid;

    private String fContent;

    private Integer fReaded;

    private String mId;

    private String oId;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId == null ? null : fId.trim();
    }

    public String getfReceiveid() {
        return fReceiveid;
    }

    public void setfReceiveid(String fReceiveid) {
        this.fReceiveid = fReceiveid == null ? null : fReceiveid.trim();
    }

    public String getfContent() {
        return fContent;
    }

    public void setfContent(String fContent) {
        this.fContent = fContent == null ? null : fContent.trim();
    }

    public Integer getfReaded() {
        return fReaded;
    }

    public void setfReaded(Integer fReaded) {
        this.fReaded = fReaded;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }
}