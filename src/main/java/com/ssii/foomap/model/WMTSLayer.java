package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.DataSource;
import com.ssii.foomap.model.Image;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * 切片地图图层
 */
@ApiModel(description = "切片地图图层")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class WMTSLayer   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("descripton")
  private String descripton = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("icon")
  private Image icon = null;

  @JsonProperty("image")
  private Image image = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("data-source")
  private DataSource dataSource = null;

  @JsonProperty("domains")
  @Valid
  private List<String> domains = null;

  @JsonProperty("minZoom")
  private Integer minZoom = null;

  @JsonProperty("maxZoom")
  private Integer maxZoom = null;

  @JsonProperty("layers")
  private String layers = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("style")
  private String style = null;

  @JsonProperty("attribution")
  private String attribution = null;

  @JsonProperty("tilematrixSet")
  private String tilematrixSet = null;

  public WMTSLayer id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * 图层编号
   * @return id
  **/
  @ApiModelProperty(value = "图层编号")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WMTSLayer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 图层名称
   * @return name
  **/
  @ApiModelProperty(value = "图层名称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WMTSLayer descripton(String descripton) {
    this.descripton = descripton;
    return this;
  }

  /**
   * 图层说明描述
   * @return descripton
  **/
  @ApiModelProperty(value = "图层说明描述")


  public String getDescripton() {
    return descripton;
  }

  public void setDescripton(String descripton) {
    this.descripton = descripton;
  }

  public WMTSLayer tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WMTSLayer addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * 图层描述标签，附属描述标签
   * @return tags
  **/
  @ApiModelProperty(value = "图层描述标签，附属描述标签")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public WMTSLayer icon(Image icon) {
    this.icon = icon;
    return this;
  }

  /**
   * 图层图村资源
   * @return icon
  **/
  @ApiModelProperty(value = "图层图村资源")

  @Valid

  public Image getIcon() {
    return icon;
  }

  public void setIcon(Image icon) {
    this.icon = icon;
  }

  public WMTSLayer image(Image image) {
    this.image = image;
    return this;
  }

  /**
   * 图层图片资源，封面图等
   * @return image
  **/
  @ApiModelProperty(value = "图层图片资源，封面图等")

  @Valid

  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public WMTSLayer url(String url) {
    this.url = url;
    return this;
  }

  /**
   * 图层url
   * @return url
  **/
  @ApiModelProperty(example = "http://{s}.tianditu.com/vec_a/{x}/{y}/{z}.jpg", value = "图层url")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WMTSLayer dataSource(DataSource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * 对应的数据源，对应数据库里的数据表名
   * @return dataSource
  **/
  @ApiModelProperty(value = "对应的数据源，对应数据库里的数据表名")

  @Valid

  public DataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public WMTSLayer domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public WMTSLayer addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<String>();
    }
    this.domains.add(domainsItem);
    return this;
  }

  /**
   * 分域集合，对应Url里的{s}
   * @return domains
  **/
  @ApiModelProperty(value = "分域集合，对应Url里的{s}")


  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public WMTSLayer minZoom(Integer minZoom) {
    this.minZoom = minZoom;
    return this;
  }

  /**
   * 最小显示级别
   * @return minZoom
  **/
  @ApiModelProperty(value = "最小显示级别")


  public Integer getMinZoom() {
    return minZoom;
  }

  public void setMinZoom(Integer minZoom) {
    this.minZoom = minZoom;
  }

  public WMTSLayer maxZoom(Integer maxZoom) {
    this.maxZoom = maxZoom;
    return this;
  }

  /**
   * 最大显示级别
   * @return maxZoom
  **/
  @ApiModelProperty(value = "最大显示级别")


  public Integer getMaxZoom() {
    return maxZoom;
  }

  public void setMaxZoom(Integer maxZoom) {
    this.maxZoom = maxZoom;
  }

  public WMTSLayer layers(String layers) {
    this.layers = layers;
    return this;
  }

  /**
   * Get layers
   * @return layers
  **/
  @ApiModelProperty(value = "")


  public String getLayers() {
    return layers;
  }

  public void setLayers(String layers) {
    this.layers = layers;
  }

  public WMTSLayer format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public WMTSLayer style(String style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
  **/
  @ApiModelProperty(value = "")


  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public WMTSLayer attribution(String attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * Get attribution
   * @return attribution
  **/
  @ApiModelProperty(value = "")


  public String getAttribution() {
    return attribution;
  }

  public void setAttribution(String attribution) {
    this.attribution = attribution;
  }

  public WMTSLayer tilematrixSet(String tilematrixSet) {
    this.tilematrixSet = tilematrixSet;
    return this;
  }

  /**
   * Get tilematrixSet
   * @return tilematrixSet
  **/
  @ApiModelProperty(value = "")


  public String getTilematrixSet() {
    return tilematrixSet;
  }

  public void setTilematrixSet(String tilematrixSet) {
    this.tilematrixSet = tilematrixSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WMTSLayer wmTSLayer = (WMTSLayer) o;
    return Objects.equals(this.id, wmTSLayer.id) &&
        Objects.equals(this.name, wmTSLayer.name) &&
        Objects.equals(this.descripton, wmTSLayer.descripton) &&
        Objects.equals(this.tags, wmTSLayer.tags) &&
        Objects.equals(this.icon, wmTSLayer.icon) &&
        Objects.equals(this.image, wmTSLayer.image) &&
        Objects.equals(this.url, wmTSLayer.url) &&
        Objects.equals(this.dataSource, wmTSLayer.dataSource) &&
        Objects.equals(this.domains, wmTSLayer.domains) &&
        Objects.equals(this.minZoom, wmTSLayer.minZoom) &&
        Objects.equals(this.maxZoom, wmTSLayer.maxZoom) &&
        Objects.equals(this.layers, wmTSLayer.layers) &&
        Objects.equals(this.format, wmTSLayer.format) &&
        Objects.equals(this.style, wmTSLayer.style) &&
        Objects.equals(this.attribution, wmTSLayer.attribution) &&
        Objects.equals(this.tilematrixSet, wmTSLayer.tilematrixSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descripton, tags, icon, image, url, dataSource, domains, minZoom, maxZoom, layers, format, style, attribution, tilematrixSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WMTSLayer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descripton: ").append(toIndentedString(descripton)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    minZoom: ").append(toIndentedString(minZoom)).append("\n");
    sb.append("    maxZoom: ").append(toIndentedString(maxZoom)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
    sb.append("    tilematrixSet: ").append(toIndentedString(tilematrixSet)).append("\n");
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

