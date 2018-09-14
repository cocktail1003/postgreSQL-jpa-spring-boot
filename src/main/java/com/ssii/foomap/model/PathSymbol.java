package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * PathSymbol
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class PathSymbol   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("radius")
  private Integer radius = null;

  @JsonProperty("stroke")
  private Boolean stroke = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("weight")
  private Integer weight = null;

  @JsonProperty("opacity")
  private BigDecimal opacity = null;

  /**
   * 线终点的形状
   */
  public enum LineCapEnum {
    BUTT("butt"),
    
    ROUND("round"),
    
    SQUARE("square");

    private String value;

    LineCapEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LineCapEnum fromValue(String text) {
      for (LineCapEnum b : LineCapEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("line-cap")
  private LineCapEnum lineCap = null;

  /**
   * 线转角处的形状
   */
  public enum LineJoinEnum {
    MITER("miter"),
    
    ROUND("round"),
    
    BEVEL("bevel");

    private String value;

    LineJoinEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LineJoinEnum fromValue(String text) {
      for (LineJoinEnum b : LineJoinEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("line-join")
  private LineJoinEnum lineJoin = null;

  @JsonProperty("dash-array")
  private String dashArray = null;

  @JsonProperty("dash-offset")
  private String dashOffset = null;

  @JsonProperty("fill")
  private Boolean fill = null;

  @JsonProperty("fill-color")
  private String fillColor = null;

  @JsonProperty("fill-opacity")
  private BigDecimal fillOpacity = null;

  /**
   * Gets or Sets fillRule
   */
  public enum FillRuleEnum {
    NONZERO("nonzero"),
    
    EVENODD("evenodd");

    private String value;

    FillRuleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FillRuleEnum fromValue(String text) {
      for (FillRuleEnum b : FillRuleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("fill-rule")
  private FillRuleEnum fillRule = null;

  public PathSymbol id(Integer id) {
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

  public PathSymbol radius(Integer radius) {
    this.radius = radius;
    return this;
  }

  /**
   * Get radius
   * @return radius
  **/
  @ApiModelProperty(value = "")


  public Integer getRadius() {
    return radius;
  }

  public void setRadius(Integer radius) {
    this.radius = radius;
  }

  public PathSymbol stroke(Boolean stroke) {
    this.stroke = stroke;
    return this;
  }

  /**
   * Get stroke
   * @return stroke
  **/
  @ApiModelProperty(value = "")


  public Boolean isStroke() {
    return stroke;
  }

  public void setStroke(Boolean stroke) {
    this.stroke = stroke;
  }

  public PathSymbol color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public PathSymbol weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")


  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public PathSymbol opacity(BigDecimal opacity) {
    this.opacity = opacity;
    return this;
  }

  /**
   * Get opacity
   * @return opacity
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOpacity() {
    return opacity;
  }

  public void setOpacity(BigDecimal opacity) {
    this.opacity = opacity;
  }

  public PathSymbol lineCap(LineCapEnum lineCap) {
    this.lineCap = lineCap;
    return this;
  }

  /**
   * 线终点的形状
   * @return lineCap
  **/
  @ApiModelProperty(value = "线终点的形状")


  public LineCapEnum getLineCap() {
    return lineCap;
  }

  public void setLineCap(LineCapEnum lineCap) {
    this.lineCap = lineCap;
  }

  public PathSymbol lineJoin(LineJoinEnum lineJoin) {
    this.lineJoin = lineJoin;
    return this;
  }

  /**
   * 线转角处的形状
   * @return lineJoin
  **/
  @ApiModelProperty(value = "线转角处的形状")


  public LineJoinEnum getLineJoin() {
    return lineJoin;
  }

  public void setLineJoin(LineJoinEnum lineJoin) {
    this.lineJoin = lineJoin;
  }

  public PathSymbol dashArray(String dashArray) {
    this.dashArray = dashArray;
    return this;
  }

  /**
   * Get dashArray
   * @return dashArray
  **/
  @ApiModelProperty(value = "")


  public String getDashArray() {
    return dashArray;
  }

  public void setDashArray(String dashArray) {
    this.dashArray = dashArray;
  }

  public PathSymbol dashOffset(String dashOffset) {
    this.dashOffset = dashOffset;
    return this;
  }

  /**
   * Get dashOffset
   * @return dashOffset
  **/
  @ApiModelProperty(value = "")


  public String getDashOffset() {
    return dashOffset;
  }

  public void setDashOffset(String dashOffset) {
    this.dashOffset = dashOffset;
  }

  public PathSymbol fill(Boolean fill) {
    this.fill = fill;
    return this;
  }

  /**
   * Get fill
   * @return fill
  **/
  @ApiModelProperty(value = "")


  public Boolean isFill() {
    return fill;
  }

  public void setFill(Boolean fill) {
    this.fill = fill;
  }

  public PathSymbol fillColor(String fillColor) {
    this.fillColor = fillColor;
    return this;
  }

  /**
   * Get fillColor
   * @return fillColor
  **/
  @ApiModelProperty(value = "")


  public String getFillColor() {
    return fillColor;
  }

  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  public PathSymbol fillOpacity(BigDecimal fillOpacity) {
    this.fillOpacity = fillOpacity;
    return this;
  }

  /**
   * Get fillOpacity
   * @return fillOpacity
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFillOpacity() {
    return fillOpacity;
  }

  public void setFillOpacity(BigDecimal fillOpacity) {
    this.fillOpacity = fillOpacity;
  }

  public PathSymbol fillRule(FillRuleEnum fillRule) {
    this.fillRule = fillRule;
    return this;
  }

  /**
   * Get fillRule
   * @return fillRule
  **/
  @ApiModelProperty(value = "")


  public FillRuleEnum getFillRule() {
    return fillRule;
  }

  public void setFillRule(FillRuleEnum fillRule) {
    this.fillRule = fillRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathSymbol pathSymbol = (PathSymbol) o;
    return Objects.equals(this.id, pathSymbol.id) &&
        Objects.equals(this.radius, pathSymbol.radius) &&
        Objects.equals(this.stroke, pathSymbol.stroke) &&
        Objects.equals(this.color, pathSymbol.color) &&
        Objects.equals(this.weight, pathSymbol.weight) &&
        Objects.equals(this.opacity, pathSymbol.opacity) &&
        Objects.equals(this.lineCap, pathSymbol.lineCap) &&
        Objects.equals(this.lineJoin, pathSymbol.lineJoin) &&
        Objects.equals(this.dashArray, pathSymbol.dashArray) &&
        Objects.equals(this.dashOffset, pathSymbol.dashOffset) &&
        Objects.equals(this.fill, pathSymbol.fill) &&
        Objects.equals(this.fillColor, pathSymbol.fillColor) &&
        Objects.equals(this.fillOpacity, pathSymbol.fillOpacity) &&
        Objects.equals(this.fillRule, pathSymbol.fillRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, radius, stroke, color, weight, opacity, lineCap, lineJoin, dashArray, dashOffset, fill, fillColor, fillOpacity, fillRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathSymbol {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    stroke: ").append(toIndentedString(stroke)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    lineCap: ").append(toIndentedString(lineCap)).append("\n");
    sb.append("    lineJoin: ").append(toIndentedString(lineJoin)).append("\n");
    sb.append("    dashArray: ").append(toIndentedString(dashArray)).append("\n");
    sb.append("    dashOffset: ").append(toIndentedString(dashOffset)).append("\n");
    sb.append("    fill: ").append(toIndentedString(fill)).append("\n");
    sb.append("    fillColor: ").append(toIndentedString(fillColor)).append("\n");
    sb.append("    fillOpacity: ").append(toIndentedString(fillOpacity)).append("\n");
    sb.append("    fillRule: ").append(toIndentedString(fillRule)).append("\n");
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

