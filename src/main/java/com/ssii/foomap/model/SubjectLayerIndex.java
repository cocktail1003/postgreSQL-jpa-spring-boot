package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * 专题下的图层信息，主要包括排序信息，主要用于更新顺序时使用
 */
@ApiModel(description = "专题下的图层信息，主要包括排序信息，主要用于更新顺序时使用")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class SubjectLayerIndex   {
  @JsonProperty("layerId")
  private Integer layerId = null;

  /**
   * 图层类型
   */
  public enum LayerTypeEnum {
    TMS("tms"),
    
    WMS("wms"),
    
    WMTS("wmts"),
    
    GEOJSON("geojson");

    private String value;

    LayerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LayerTypeEnum fromValue(String text) {
      for (LayerTypeEnum b : LayerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("layerType")
  private LayerTypeEnum layerType = null;

  @JsonProperty("layerIndex")
  private Integer layerIndex = null;

  public SubjectLayerIndex layerId(Integer layerId) {
    this.layerId = layerId;
    return this;
  }

  /**
   * 图层编号
   * @return layerId
  **/
  @ApiModelProperty(value = "图层编号")


  public Integer getLayerId() {
    return layerId;
  }

  public void setLayerId(Integer layerId) {
    this.layerId = layerId;
  }

  public SubjectLayerIndex layerType(LayerTypeEnum layerType) {
    this.layerType = layerType;
    return this;
  }

  /**
   * 图层类型
   * @return layerType
  **/
  @ApiModelProperty(value = "图层类型")


  public LayerTypeEnum getLayerType() {
    return layerType;
  }

  public void setLayerType(LayerTypeEnum layerType) {
    this.layerType = layerType;
  }

  public SubjectLayerIndex layerIndex(Integer layerIndex) {
    this.layerIndex = layerIndex;
    return this;
  }

  /**
   * 图层在专题中的排序
   * @return layerIndex
  **/
  @ApiModelProperty(value = "图层在专题中的排序")


  public Integer getLayerIndex() {
    return layerIndex;
  }

  public void setLayerIndex(Integer layerIndex) {
    this.layerIndex = layerIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectLayerIndex subjectLayerIndex = (SubjectLayerIndex) o;
    return Objects.equals(this.layerId, subjectLayerIndex.layerId) &&
        Objects.equals(this.layerType, subjectLayerIndex.layerType) &&
        Objects.equals(this.layerIndex, subjectLayerIndex.layerIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layerId, layerType, layerIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectLayerIndex {\n");
    
    sb.append("    layerId: ").append(toIndentedString(layerId)).append("\n");
    sb.append("    layerType: ").append(toIndentedString(layerType)).append("\n");
    sb.append("    layerIndex: ").append(toIndentedString(layerIndex)).append("\n");
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

