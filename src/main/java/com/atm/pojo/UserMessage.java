package com.atm.pojo;

import java.util.Date;

public class UserMessage {
    private Integer mId;

    private Integer uId;

    private String mTitle;

    private String mDetail;

    private Date mDate;

    private Boolean mRead;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle == null ? null : mTitle.trim();
    }

    public String getmDetail() {
        return mDetail;
    }

    public void setmDetail(String mDetail) {
        this.mDetail = mDetail == null ? null : mDetail.trim();
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Boolean getmRead() {
        return mRead;
    }

    public void setmRead(Boolean mRead) {
        this.mRead = mRead;
    }
}