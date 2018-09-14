package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.IconSymbol;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * SimpleIconRender
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class SimpleIconRender   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("symbol")
  private IconSymbol symbol = null;

  public SimpleIconRender id(Integer id) {
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

  public SimpleIconRender symbol(IconSymbol symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IconSymbol getSymbol() {
    return symbol;
  }

  public void setSymbol(IconSymbol symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleIconRender simpleIconRender = (SimpleIconRender) o;
    return Objects.equals(this.id, simpleIconRender.id) &&
        Objects.equals(this.symbol, simpleIconRender.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, symbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleIconRender {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

