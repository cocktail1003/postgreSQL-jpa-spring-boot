package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * 源数据字段描述信息
 */
@ApiModel(description = "源数据字段描述信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class DataSourceField   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("label")
  private String label = null;

  public DataSourceField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 字段名称
   * @return name
  **/
  @ApiModelProperty(value = "字段名称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataSourceField type(String type) {
    this.type = type;
    return this;
  }

  /**
   * 字段数据类型
   * @return type
  **/
  @ApiModelProperty(value = "字段数据类型")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DataSourceField label(String label) {
    this.label = label;
    return this;
  }

  /**
   * 字段名对应的中文标识
   * @return label
  **/
  @ApiModelProperty(value = "字段名对应的中文标识")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSourceField dataSourceField = (DataSourceField) o;
    return Objects.equals(this.name, dataSourceField.name) &&
        Objects.equals(this.type, dataSourceField.type) &&
        Objects.equals(this.label, dataSourceField.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSourceField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

