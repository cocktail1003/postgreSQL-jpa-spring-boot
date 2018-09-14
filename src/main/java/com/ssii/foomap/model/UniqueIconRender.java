package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.KeyIconSymbolPair;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * UniqueIconRender
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class UniqueIconRender   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("property")
  private String property = null;

  @JsonProperty("symbols")
  @Valid
  private List<KeyIconSymbolPair> symbols = null;

  public UniqueIconRender id(Integer id) {
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

  public UniqueIconRender property(String property) {
    this.property = property;
    return this;
  }

  /**
   * 属性名
   * @return property
  **/
  @ApiModelProperty(value = "属性名")


  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public UniqueIconRender symbols(List<KeyIconSymbolPair> symbols) {
    this.symbols = symbols;
    return this;
  }

  public UniqueIconRender addSymbolsItem(KeyIconSymbolPair symbolsItem) {
    if (this.symbols == null) {
      this.symbols = new ArrayList<KeyIconSymbolPair>();
    }
    this.symbols.add(symbolsItem);
    return this;
  }

  /**
   * Symbol集体，最好wget Map<object,IconSymbol>的数据结构
   * @return symbols
  **/
  @ApiModelProperty(value = "Symbol集体，最好wget Map<object,IconSymbol>的数据结构")

  @Valid

  public List<KeyIconSymbolPair> getSymbols() {
    return symbols;
  }

  public void setSymbols(List<KeyIconSymbolPair> symbols) {
    this.symbols = symbols;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniqueIconRender uniqueIconRender = (UniqueIconRender) o;
    return Objects.equals(this.id, uniqueIconRender.id) &&
        Objects.equals(this.property, uniqueIconRender.property) &&
        Objects.equals(this.symbols, uniqueIconRender.symbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, property, symbols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueIconRender {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
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

