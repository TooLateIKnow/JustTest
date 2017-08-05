package com.kms.action;

/**
 * Created by Administrator on 2017/7/6.
 */
public class DemoAction {
    private String msg;
    public String execute(){
        System.out.println(msg);
        return "success";
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
