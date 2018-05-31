package com.meituan.pojo;

public class User {
    private String uId;

    private String uPicture;

    private String uPassword;

    private Double uAccount;

    private String uNickname;

    private Integer uIsban;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getuPicture() {
        return uPicture;
    }

    public void setuPicture(String uPicture) {
        this.uPicture = uPicture == null ? null : uPicture.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Double getuAccount() {
        return uAccount;
    }

    public void setuAccount(Double uAccount) {
        this.uAccount = uAccount;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public Integer getuIsban() {
        return uIsban;
    }

    public void setuIsban(Integer uIsban) {
        this.uIsban = uIsban;
    }
}