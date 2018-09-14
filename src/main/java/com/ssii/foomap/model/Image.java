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
 * Image
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class Image   {
  @JsonProperty("size")
  @Valid
  private List<BigDecimal> size = null;

  @JsonProperty("drawable")
  private String drawable = null;

  @JsonProperty("drawable-hover")
  private String drawableHover = null;

  @JsonProperty("drawable-selected")
  private String drawableSelected = null;

  @JsonProperty("drawable-disable")
  private String drawableDisable = null;

  public Image size(List<BigDecimal> size) {
    this.size = size;
    return this;
  }

  public Image addSizeItem(BigDecimal sizeItem) {
    if (this.size == null) {
      this.size = new ArrayList<BigDecimal>();
    }
    this.size.add(sizeItem);
    return this;
  }

  /**
   * 图片大小，[width,height]
   * @return size
  **/
  @ApiModelProperty(value = "图片大小，[width,height]")

  @Valid

  public List<BigDecimal> getSize() {
    return size;
  }

  public void setSize(List<BigDecimal> size) {
    this.size = size;
  }

  public Image drawable(String drawable) {
    this.drawable = drawable;
    return this;
  }

  /**
   * 默认状态下的图标资源地址
   * @return drawable
  **/
  @ApiModelProperty(value = "默认状态下的图标资源地址")


  public String getDrawable() {
    return drawable;
  }

  public void setDrawable(String drawable) {
    this.drawable = drawable;
  }

  public Image drawableHover(String drawableHover) {
    this.drawableHover = drawableHover;
    return this;
  }

  /**
   * 鼠标悬浮时的图标资源地址
   * @return drawableHover
  **/
  @ApiModelProperty(value = "鼠标悬浮时的图标资源地址")


  public String getDrawableHover() {
    return drawableHover;
  }

  public void setDrawableHover(String drawableHover) {
    this.drawableHover = drawableHover;
  }

  public Image drawableSelected(String drawableSelected) {
    this.drawableSelected = drawableSelected;
    return this;
  }

  /**
   * 选中状态的图标资源地址
   * @return drawableSelected
  **/
  @ApiModelProperty(value = "选中状态的图标资源地址")


  public String getDrawableSelected() {
    return drawableSelected;
  }

  public void setDrawableSelected(String drawableSelected) {
    this.drawableSelected = drawableSelected;
  }

  public Image drawableDisable(String drawableDisable) {
    this.drawableDisable = drawableDisable;
    return this;
  }

  /**
   * 不可用状态的图标资源地址
   * @return drawableDisable
  **/
  @ApiModelProperty(value = "不可用状态的图标资源地址")


  public String getDrawableDisable() {
    return drawableDisable;
  }

  public void setDrawableDisable(String drawableDisable) {
    this.drawableDisable = drawableDisable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.size, image.size) &&
        Objects.equals(this.drawable, image.drawable) &&
        Objects.equals(this.drawableHover, image.drawableHover) &&
        Objects.equals(this.drawableSelected, image.drawableSelected) &&
        Objects.equals(this.drawableDisable, image.drawableDisable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, drawable, drawableHover, drawableSelected, drawableDisable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    drawable: ").append(toIndentedString(drawable)).append("\n");
    sb.append("    drawableHover: ").append(toIndentedString(drawableHover)).append("\n");
    sb.append("    drawableSelected: ").append(toIndentedString(drawableSelected)).append("\n");
    sb.append("    drawableDisable: ").append(toIndentedString(drawableDisable)).append("\n");
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

