package com.kunleen.sn.sportnewsapplication.network.bean;

/**
 * Created by ysy on 2018/1/29.
 */

public class ReqLogin {
    private String mobile;
    private String password;
    private String code;


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
