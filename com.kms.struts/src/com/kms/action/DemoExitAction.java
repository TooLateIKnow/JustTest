package com.kms.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/7/6.
 */
public class DemoExitAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("public class DemoExitAction extends ActionSupport");
        ActionSupport.LOG.debug("--------ActionSupport.LOG----------------");
        return SUCCESS;
    }
}
