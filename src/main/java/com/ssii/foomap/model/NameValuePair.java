package com.ssii.foomap.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * 字段串类型的name-value键值对
 */
@ApiModel(description = "字段串类型的name-value键值对")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class NameValuePair   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  public NameValuePair name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 图层名称
   * @return name
  **/
  @ApiModelProperty(value = "图层名称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NameValuePair value(String value) {
    this.value = value;
    return this;
  }

  /**
   * 查询结果，geojson字符串
   * @return value
  **/
  @ApiModelProperty(value = "查询结果，geojson字符串")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameValuePair nameValuePair = (NameValuePair) o;
    return Objects.equals(this.name, nameValuePair.name) &&
        Objects.equals(this.value, nameValuePair.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameValuePair {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

