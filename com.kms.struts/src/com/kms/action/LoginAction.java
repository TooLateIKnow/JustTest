package com.kms.action;

/**
 * Created by Administrator on 2017/7/5.
 */
public class LoginAction {
    private String pnm;
    private String pwd;

    public String login(){
        System.out.println(pnm);
        System.out.println(pwd);
        return "success";
    }
    public String getPnm() {
        return pnm;
    }

    public void setPnm(String pnm) {
        this.pnm = pnm;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


}
