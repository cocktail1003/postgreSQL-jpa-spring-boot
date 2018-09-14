package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * IconSymbol
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class IconSymbol   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("iconUrl")
  private String iconUrl = null;

  @JsonProperty("iconSize")
  @Valid
  private List<Integer> iconSize = null;

  @JsonProperty("iconAnchor")
  @Valid
  private List<Integer> iconAnchor = null;

  @JsonProperty("shadowUrl")
  private String shadowUrl = null;

  @JsonProperty("shadowSize")
  @Valid
  private List<Integer> shadowSize = null;

  @JsonProperty("shadowAnchor")
  @Valid
  private List<Integer> shadowAnchor = null;

  @JsonProperty("popupAnchor")
  @Valid
  private List<Integer> popupAnchor = null;

  public IconSymbol id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * 编号
   * @return id
  **/
  @ApiModelProperty(value = "编号")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public IconSymbol iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * Get iconUrl
   * @return iconUrl
  **/
  @ApiModelProperty(value = "")


  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public IconSymbol iconSize(List<Integer> iconSize) {
    this.iconSize = iconSize;
    return this;
  }

  public IconSymbol addIconSizeItem(Integer iconSizeItem) {
    if (this.iconSize == null) {
      this.iconSize = new ArrayList<Integer>();
    }
    this.iconSize.add(iconSizeItem);
    return this;
  }

  /**
   * Get iconSize
   * @return iconSize
  **/
  @ApiModelProperty(value = "")


  public List<Integer> getIconSize() {
    return iconSize;
  }

  public void setIconSize(List<Integer> iconSize) {
    this.iconSize = iconSize;
  }

  public IconSymbol iconAnchor(List<Integer> iconAnchor) {
    this.iconAnchor = iconAnchor;
    return this;
  }

  public IconSymbol addIconAnchorItem(Integer iconAnchorItem) {
    if (this.iconAnchor == null) {
      this.iconAnchor = new ArrayList<Integer>();
    }
    this.iconAnchor.add(iconAnchorItem);
    return this;
  }

  /**
   * Get iconAnchor
   * @return iconAnchor
  **/
  @ApiModelProperty(value = "")


  public List<Integer> getIconAnchor() {
    return iconAnchor;
  }

  public void setIconAnchor(List<Integer> iconAnchor) {
    this.iconAnchor = iconAnchor;
  }

  public IconSymbol shadowUrl(String shadowUrl) {
    this.shadowUrl = shadowUrl;
    return this;
  }

  /**
   * Get shadowUrl
   * @return shadowUrl
  **/
  @ApiModelProperty(value = "")


  public String getShadowUrl() {
    return shadowUrl;
  }

  public void setShadowUrl(String shadowUrl) {
    this.shadowUrl = shadowUrl;
  }

  public IconSymbol shadowSize(List<Integer> shadowSize) {
    this.shadowSize = shadowSize;
    return this;
  }

  public IconSymbol addShadowSizeItem(Integer shadowSizeItem) {
    if (this.shadowSize == null) {
      this.shadowSize = new ArrayList<Integer>();
    }
    this.shadowSize.add(shadowSizeItem);
    return this;
  }

  /**
   * Get shadowSize
   * @return shadowSize
  **/
  @ApiModelProperty(value = "")


  public List<Integer> getShadowSize() {
    return shadowSize;
  }

  public void setShadowSize(List<Integer> shadowSize) {
    this.shadowSize = shadowSize;
  }

  public IconSymbol shadowAnchor(List<Integer> shadowAnchor) {
    this.shadowAnchor = shadowAnchor;
    return this;
  }

  public IconSymbol addShadowAnchorItem(Integer shadowAnchorItem) {
    if (this.shadowAnchor == null) {
      this.shadowAnchor = new ArrayList<Integer>();
    }
    this.shadowAnchor.add(shadowAnchorItem);
    return this;
  }

  /**
   * Get shadowAnchor
   * @return shadowAnchor
  **/
  @ApiModelProperty(value = "")


  public List<Integer> getShadowAnchor() {
    return shadowAnchor;
  }

  public void setShadowAnchor(List<Integer> shadowAnchor) {
    this.shadowAnchor = shadowAnchor;
  }

  public IconSymbol popupAnchor(List<Integer> popupAnchor) {
    this.popupAnchor = popupAnchor;
    return this;
  }

  public IconSymbol addPopupAnchorItem(Integer popupAnchorItem) {
    if (this.popupAnchor == null) {
      this.popupAnchor = new ArrayList<Integer>();
    }
    this.popupAnchor.add(popupAnchorItem);
    return this;
  }

  /**
   * Get popupAnchor
   * @return popupAnchor
  **/
  @ApiModelProperty(value = "")


  public List<Integer> getPopupAnchor() {
    return popupAnchor;
  }

  public void setPopupAnchor(List<Integer> popupAnchor) {
    this.popupAnchor = popupAnchor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IconSymbol iconSymbol = (IconSymbol) o;
    return Objects.equals(this.id, iconSymbol.id) &&
        Objects.equals(this.iconUrl, iconSymbol.iconUrl) &&
        Objects.equals(this.iconSize, iconSymbol.iconSize) &&
        Objects.equals(this.iconAnchor, iconSymbol.iconAnchor) &&
        Objects.equals(this.shadowUrl, iconSymbol.shadowUrl) &&
        Objects.equals(this.shadowSize, iconSymbol.shadowSize) &&
        Objects.equals(this.shadowAnchor, iconSymbol.shadowAnchor) &&
        Objects.equals(this.popupAnchor, iconSymbol.popupAnchor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, iconUrl, iconSize, iconAnchor, shadowUrl, shadowSize, shadowAnchor, popupAnchor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IconSymbol {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    iconSize: ").append(toIndentedString(iconSize)).append("\n");
    sb.append("    iconAnchor: ").append(toIndentedString(iconAnchor)).append("\n");
    sb.append("    shadowUrl: ").append(toIndentedString(shadowUrl)).append("\n");
    sb.append("    shadowSize: ").append(toIndentedString(shadowSize)).append("\n");
    sb.append("    shadowAnchor: ").append(toIndentedString(shadowAnchor)).append("\n");
    sb.append("    popupAnchor: ").append(toIndentedString(popupAnchor)).append("\n");
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

