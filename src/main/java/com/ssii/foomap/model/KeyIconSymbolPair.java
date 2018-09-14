package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.IconSymbol;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * KeyIconSymbolPair
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class KeyIconSymbolPair   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("icon")
  private IconSymbol icon = null;

  public KeyIconSymbolPair key(String key) {
    this.key = key;
    return this;
  }

  /**
   * 值
   * @return key
  **/
  @ApiModelProperty(value = "值")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public KeyIconSymbolPair icon(IconSymbol icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IconSymbol getIcon() {
    return icon;
  }

  public void setIcon(IconSymbol icon) {
    this.icon = icon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyIconSymbolPair keyIconSymbolPair = (KeyIconSymbolPair) o;
    return Objects.equals(this.key, keyIconSymbolPair.key) &&
        Objects.equals(this.icon, keyIconSymbolPair.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyIconSymbolPair {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

