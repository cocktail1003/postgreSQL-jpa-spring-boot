package com.ssii.foomap.auth.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * Name:Authentication
 * Description: 用户请求认证时发送的数据实体，包括登录名和短信验证码
 * Author:yxc
 * Time: 2018/9/7 10:27
 */
public class VerificationAuthentication implements Serializable {

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String mobile;

    /**
     * 短信验证码
     */
    @ApiModelProperty(value = "短信验证码")
    private String verificationCode;

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
