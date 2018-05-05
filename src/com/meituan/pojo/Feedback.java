package com.meituan.pojo;

import java.util.Date;

public class Feedback {
    private String fId;

    private String fReceiveid;

    private Date fTime;

    private String fContent;

    private Integer fReaded;

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

    public Date getfTime() {
        return fTime;
    }

    public void setfTime(Date fTime) {
        this.fTime = fTime;
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
}