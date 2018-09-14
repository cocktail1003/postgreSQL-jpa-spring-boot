package com.ssii.foomap.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * AccountReg
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class AccountReg   {
  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("code")
  private String code = null;

  public AccountReg phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * 手机号
   * @return phone
  **/
  @ApiModelProperty(value = "手机号")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AccountReg password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 登录密码
   * @return password
  **/
  @ApiModelProperty(value = "登录密码")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AccountReg code(String code) {
    this.code = code;
    return this;
  }

  /**
   * 短信验证码
   * @return code
  **/
  @ApiModelProperty(value = "短信验证码")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountReg accountReg = (AccountReg) o;
    return Objects.equals(this.phone, accountReg.phone) &&
        Objects.equals(this.password, accountReg.password) &&
        Objects.equals(this.code, accountReg.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, password, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReg {\n");
    
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

