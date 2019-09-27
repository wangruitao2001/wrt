package com.lanxin.bean;



/**
 * Created by 曼珠沙华 on 2019/9/26.
 */

public class roles_permissions {

    private Integer id;

    private String role_name;

    private String permission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
