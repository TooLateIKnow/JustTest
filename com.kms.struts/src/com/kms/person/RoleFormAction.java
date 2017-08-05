package com.kms.person;

import com.kms.pojo.Role;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Administrator on 2017/7/6.
 */
public class RoleFormAction extends ActionSupport implements ModelDriven<Role> {
    private int rid;
    private String rnm;
    private Role role = new Role();//必须立即实例化

    @Override
    public String execute() throws Exception {
        System.out.println(role.getRid());
        System.out.println(role.getRnm());

        return SUCCESS;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRnm() {
        return rnm;
    }

    public void setRnm(String rnm) {
        this.rnm = rnm;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public Role getModel() {
        if(this.role == null){
            this.role = new Role();

        }
        return this.role;
    }
}
