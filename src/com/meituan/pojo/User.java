package com.meituan.pojo;

public class User {
    private Integer uId;

    private String uPicture;

    private String uNickname;

    private String uSex;

    private String uAddress;

    private Integer uIsban;
    

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuPicture() {
        return uPicture;
    }

    public void setuPicture(String uPicture) {
        this.uPicture = uPicture == null ? null : uPicture.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public Integer getuIsban() {
        return uIsban;
    }

    public void setuIsban(Integer uIsban) {
        this.uIsban = uIsban;
    }
}