package com.ssii.foomap.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Auth
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class Auth   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  /**
   * 登录模式,密码登录和验证码登录，当前实现密码登录
   */
  public enum ModeEnum {
    PASSWORD("password"),
    
    SMSCODE("smscode");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mode")
  private ModeEnum mode = null;

  public Auth name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 登录名
   * @return name
  **/
  @ApiModelProperty(value = "登录名")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Auth password(String password) {
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

  public Auth mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * 登录模式,密码登录和验证码登录，当前实现密码登录
   * @return mode
  **/
  @ApiModelProperty(value = "登录模式,密码登录和验证码登录，当前实现密码登录")


  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth auth = (Auth) o;
    return Objects.equals(this.name, auth.name) &&
        Objects.equals(this.password, auth.password) &&
        Objects.equals(this.mode, auth.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

