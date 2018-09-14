package com.ssii.foomap.auth.model;

import java.io.Serializable;

/**
 * Name:Authentication
 * Description: 用户请求认证时发送的数据实体，包括登录名和登录密码
 * Author:yxc
 * Time: 2018/9/7 09:53
 */
public class Authentication implements Serializable {

    /**
     * 用户名
     */
    private String name;

    /**
     * 登录密码
     */
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
