package com.meituan.pojo;

import java.util.Date;

public class Message {
    private String mId;

    private String mReceiveid;

    private Date mDate;

    private String mContent;

    private String mReaded;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getmReceiveid() {
        return mReceiveid;
    }

    public void setmReceiveid(String mReceiveid) {
        this.mReceiveid = mReceiveid == null ? null : mReceiveid.trim();
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent == null ? null : mContent.trim();
    }

    public String getmReaded() {
        return mReaded;
    }

    public void setmReaded(String mReaded) {
        this.mReaded = mReaded == null ? null : mReaded.trim();
    }
}