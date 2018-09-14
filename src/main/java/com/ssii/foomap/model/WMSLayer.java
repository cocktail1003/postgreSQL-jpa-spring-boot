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

public class WMSLayer   {
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

  @JsonProperty("transparent")
  private Boolean transparent = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("uppercase")
  private Boolean uppercase = null;

  public WMSLayer id(Integer id) {
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

  public WMSLayer name(String name) {
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

  public WMSLayer descripton(String descripton) {
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

  public WMSLayer tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WMSLayer addTagsItem(String tagsItem) {
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

  public WMSLayer icon(Image icon) {
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

  public WMSLayer image(Image image) {
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

  public WMSLayer url(String url) {
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

  public WMSLayer dataSource(DataSource dataSource) {
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

  public WMSLayer domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public WMSLayer addDomainsItem(String domainsItem) {
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

  public WMSLayer minZoom(Integer minZoom) {
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

  public WMSLayer maxZoom(Integer maxZoom) {
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

  public WMSLayer layers(String layers) {
    this.layers = layers;
    return this;
  }

  /**
   * 图层名称
   * @return layers
  **/
  @ApiModelProperty(value = "图层名称")


  public String getLayers() {
    return layers;
  }

  public void setLayers(String layers) {
    this.layers = layers;
  }

  public WMSLayer format(String format) {
    this.format = format;
    return this;
  }

  /**
   * 图层格式
   * @return format
  **/
  @ApiModelProperty(value = "图层格式")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public WMSLayer style(String style) {
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

  public WMSLayer attribution(String attribution) {
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

  public WMSLayer transparent(Boolean transparent) {
    this.transparent = transparent;
    return this;
  }

  /**
   * Get transparent
   * @return transparent
  **/
  @ApiModelProperty(value = "")


  public Boolean isTransparent() {
    return transparent;
  }

  public void setTransparent(Boolean transparent) {
    this.transparent = transparent;
  }

  public WMSLayer version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public WMSLayer uppercase(Boolean uppercase) {
    this.uppercase = uppercase;
    return this;
  }

  /**
   * Get uppercase
   * @return uppercase
  **/
  @ApiModelProperty(value = "")


  public Boolean isUppercase() {
    return uppercase;
  }

  public void setUppercase(Boolean uppercase) {
    this.uppercase = uppercase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WMSLayer wmSLayer = (WMSLayer) o;
    return Objects.equals(this.id, wmSLayer.id) &&
        Objects.equals(this.name, wmSLayer.name) &&
        Objects.equals(this.descripton, wmSLayer.descripton) &&
        Objects.equals(this.tags, wmSLayer.tags) &&
        Objects.equals(this.icon, wmSLayer.icon) &&
        Objects.equals(this.image, wmSLayer.image) &&
        Objects.equals(this.url, wmSLayer.url) &&
        Objects.equals(this.dataSource, wmSLayer.dataSource) &&
        Objects.equals(this.domains, wmSLayer.domains) &&
        Objects.equals(this.minZoom, wmSLayer.minZoom) &&
        Objects.equals(this.maxZoom, wmSLayer.maxZoom) &&
        Objects.equals(this.layers, wmSLayer.layers) &&
        Objects.equals(this.format, wmSLayer.format) &&
        Objects.equals(this.style, wmSLayer.style) &&
        Objects.equals(this.attribution, wmSLayer.attribution) &&
        Objects.equals(this.transparent, wmSLayer.transparent) &&
        Objects.equals(this.version, wmSLayer.version) &&
        Objects.equals(this.uppercase, wmSLayer.uppercase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descripton, tags, icon, image, url, dataSource, domains, minZoom, maxZoom, layers, format, style, attribution, transparent, version, uppercase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WMSLayer {\n");
    
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
    sb.append("    transparent: ").append(toIndentedString(transparent)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    uppercase: ").append(toIndentedString(uppercase)).append("\n");
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

