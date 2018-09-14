package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.PathSymbol;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * KeyPathSymbolPair
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class KeyPathSymbolPair   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("icon")
  private PathSymbol icon = null;

  public KeyPathSymbolPair key(String key) {
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

  public KeyPathSymbolPair icon(PathSymbol icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PathSymbol getIcon() {
    return icon;
  }

  public void setIcon(PathSymbol icon) {
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
    KeyPathSymbolPair keyPathSymbolPair = (KeyPathSymbolPair) o;
    return Objects.equals(this.key, keyPathSymbolPair.key) &&
        Objects.equals(this.icon, keyPathSymbolPair.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPathSymbolPair {\n");
    
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

