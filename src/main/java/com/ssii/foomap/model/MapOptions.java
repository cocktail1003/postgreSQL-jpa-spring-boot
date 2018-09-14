package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MapOptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class MapOptions   {
  @JsonProperty("crsCode")
  private String crsCode = null;

  @JsonProperty("crsName")
  private String crsName = null;

  @JsonProperty("crsText")
  private String crsText = null;

  @JsonProperty("resolutions")
  @Valid
  private List<BigDecimal> resolutions = null;

  @JsonProperty("origin")
  @Valid
  private List<BigDecimal> origin = null;

  @JsonProperty("center")
  @Valid
  private List<BigDecimal> center = null;

  @JsonProperty("zoom")
  private Integer zoom = null;

  @JsonProperty("maxZoom")
  private Integer maxZoom = null;

  @JsonProperty("bounds")
  @Valid
  private List<List<BigDecimal>> bounds = null;

  public MapOptions crsCode(String crsCode) {
    this.crsCode = crsCode;
    return this;
  }

  /**
   * 地图坐标系统编码，EPSG编码
   * @return crsCode
  **/
  @ApiModelProperty(example = "EPSG:4326", value = "地图坐标系统编码，EPSG编码")


  public String getCrsCode() {
    return crsCode;
  }

  public void setCrsCode(String crsCode) {
    this.crsCode = crsCode;
  }

  public MapOptions crsName(String crsName) {
    this.crsName = crsName;
    return this;
  }

  /**
   * 地图坐标系统名称
   * @return crsName
  **/
  @ApiModelProperty(value = "地图坐标系统名称")


  public String getCrsName() {
    return crsName;
  }

  public void setCrsName(String crsName) {
    this.crsName = crsName;
  }

  public MapOptions crsText(String crsText) {
    this.crsText = crsText;
    return this;
  }

  /**
   * 地图坐标系统的定义文字，Leaflet默认支持的坐标系统以外的坐标系统提供
   * @return crsText
  **/
  @ApiModelProperty(value = "地图坐标系统的定义文字，Leaflet默认支持的坐标系统以外的坐标系统提供")


  public String getCrsText() {
    return crsText;
  }

  public void setCrsText(String crsText) {
    this.crsText = crsText;
  }

  public MapOptions resolutions(List<BigDecimal> resolutions) {
    this.resolutions = resolutions;
    return this;
  }

  public MapOptions addResolutionsItem(BigDecimal resolutionsItem) {
    if (this.resolutions == null) {
      this.resolutions = new ArrayList<BigDecimal>();
    }
    this.resolutions.add(resolutionsItem);
    return this;
  }

  /**
   * 分辨率
   * @return resolutions
  **/
  @ApiModelProperty(value = "分辨率")

  @Valid

  public List<BigDecimal> getResolutions() {
    return resolutions;
  }

  public void setResolutions(List<BigDecimal> resolutions) {
    this.resolutions = resolutions;
  }

  public MapOptions origin(List<BigDecimal> origin) {
    this.origin = origin;
    return this;
  }

  public MapOptions addOriginItem(BigDecimal originItem) {
    if (this.origin == null) {
      this.origin = new ArrayList<BigDecimal>();
    }
    this.origin.add(originItem);
    return this;
  }

  /**
   * 坐标原点，偏移量等
   * @return origin
  **/
  @ApiModelProperty(value = "坐标原点，偏移量等")

  @Valid

  public List<BigDecimal> getOrigin() {
    return origin;
  }

  public void setOrigin(List<BigDecimal> origin) {
    this.origin = origin;
  }

  public MapOptions center(List<BigDecimal> center) {
    this.center = center;
    return this;
  }

  public MapOptions addCenterItem(BigDecimal centerItem) {
    if (this.center == null) {
      this.center = new ArrayList<BigDecimal>();
    }
    this.center.add(centerItem);
    return this;
  }

  /**
   * Get center
   * @return center
  **/
  @ApiModelProperty(example = "[22.345,112.234]", value = "")

  @Valid

  public List<BigDecimal> getCenter() {
    return center;
  }

  public void setCenter(List<BigDecimal> center) {
    this.center = center;
  }

  public MapOptions zoom(Integer zoom) {
    this.zoom = zoom;
    return this;
  }

  /**
   * 默认绽放级别
   * @return zoom
  **/
  @ApiModelProperty(value = "默认绽放级别")


  public Integer getZoom() {
    return zoom;
  }

  public void setZoom(Integer zoom) {
    this.zoom = zoom;
  }

  public MapOptions maxZoom(Integer maxZoom) {
    this.maxZoom = maxZoom;
    return this;
  }

  /**
   * 最大放大级别
   * @return maxZoom
  **/
  @ApiModelProperty(value = "最大放大级别")


  public Integer getMaxZoom() {
    return maxZoom;
  }

  public void setMaxZoom(Integer maxZoom) {
    this.maxZoom = maxZoom;
  }

  public MapOptions bounds(List<List<BigDecimal>> bounds) {
    this.bounds = bounds;
    return this;
  }

  public MapOptions addBoundsItem(List<BigDecimal> boundsItem) {
    if (this.bounds == null) {
      this.bounds = new ArrayList<List<BigDecimal>>();
    }
    this.bounds.add(boundsItem);
    return this;
  }

  /**
   * Get bounds
   * @return bounds
  **/
  @ApiModelProperty(example = "[[23.23,112.34],[24.56,112.46]]", value = "")

  @Valid

  public List<List<BigDecimal>> getBounds() {
    return bounds;
  }

  public void setBounds(List<List<BigDecimal>> bounds) {
    this.bounds = bounds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapOptions mapOptions = (MapOptions) o;
    return Objects.equals(this.crsCode, mapOptions.crsCode) &&
        Objects.equals(this.crsName, mapOptions.crsName) &&
        Objects.equals(this.crsText, mapOptions.crsText) &&
        Objects.equals(this.resolutions, mapOptions.resolutions) &&
        Objects.equals(this.origin, mapOptions.origin) &&
        Objects.equals(this.center, mapOptions.center) &&
        Objects.equals(this.zoom, mapOptions.zoom) &&
        Objects.equals(this.maxZoom, mapOptions.maxZoom) &&
        Objects.equals(this.bounds, mapOptions.bounds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crsCode, crsName, crsText, resolutions, origin, center, zoom, maxZoom, bounds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapOptions {\n");
    
    sb.append("    crsCode: ").append(toIndentedString(crsCode)).append("\n");
    sb.append("    crsName: ").append(toIndentedString(crsName)).append("\n");
    sb.append("    crsText: ").append(toIndentedString(crsText)).append("\n");
    sb.append("    resolutions: ").append(toIndentedString(resolutions)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
    sb.append("    maxZoom: ").append(toIndentedString(maxZoom)).append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
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

