package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * GeoJsonRender
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class GeoJsonRender   {
  /**
   * 渲染类型
   */
  public enum TypeEnum {
    SIMPLE_ICON("simple-icon"),
    
    SIMPLE_PATH("simple-path"),
    
    UNIQUE_ICON("unique-icon"),
    
    UNIQUE_PATH("unique-path");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("id")
  private Integer id = null;

  public GeoJsonRender type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * 渲染类型
   * @return type
  **/
  @ApiModelProperty(value = "渲染类型")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GeoJsonRender id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * 渲染器编号
   * @return id
  **/
  @ApiModelProperty(value = "渲染器编号")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoJsonRender geoJsonRender = (GeoJsonRender) o;
    return Objects.equals(this.type, geoJsonRender.type) &&
        Objects.equals(this.id, geoJsonRender.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJsonRender {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

