package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.KeyPathSymbolPair;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * UniquePathRender
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class UniquePathRender   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("property")
  private String property = null;

  @JsonProperty("symbols")
  @Valid
  private List<KeyPathSymbolPair> symbols = null;

  public UniquePathRender id(Integer id) {
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

  public UniquePathRender property(String property) {
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

  public UniquePathRender symbols(List<KeyPathSymbolPair> symbols) {
    this.symbols = symbols;
    return this;
  }

  public UniquePathRender addSymbolsItem(KeyPathSymbolPair symbolsItem) {
    if (this.symbols == null) {
      this.symbols = new ArrayList<KeyPathSymbolPair>();
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

  public List<KeyPathSymbolPair> getSymbols() {
    return symbols;
  }

  public void setSymbols(List<KeyPathSymbolPair> symbols) {
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
    UniquePathRender uniquePathRender = (UniquePathRender) o;
    return Objects.equals(this.id, uniquePathRender.id) &&
        Objects.equals(this.property, uniquePathRender.property) &&
        Objects.equals(this.symbols, uniquePathRender.symbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, property, symbols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniquePathRender {\n");
    
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

