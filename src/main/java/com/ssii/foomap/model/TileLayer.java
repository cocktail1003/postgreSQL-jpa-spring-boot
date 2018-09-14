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

public class TileLayer   {
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

  public TileLayer id(Integer id) {
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

  public TileLayer name(String name) {
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

  public TileLayer descripton(String descripton) {
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

  public TileLayer tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TileLayer addTagsItem(String tagsItem) {
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

  public TileLayer icon(Image icon) {
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

  public TileLayer image(Image image) {
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

  public TileLayer url(String url) {
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

  public TileLayer dataSource(DataSource dataSource) {
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

  public TileLayer domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public TileLayer addDomainsItem(String domainsItem) {
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

  public TileLayer minZoom(Integer minZoom) {
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

  public TileLayer maxZoom(Integer maxZoom) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TileLayer tileLayer = (TileLayer) o;
    return Objects.equals(this.id, tileLayer.id) &&
        Objects.equals(this.name, tileLayer.name) &&
        Objects.equals(this.descripton, tileLayer.descripton) &&
        Objects.equals(this.tags, tileLayer.tags) &&
        Objects.equals(this.icon, tileLayer.icon) &&
        Objects.equals(this.image, tileLayer.image) &&
        Objects.equals(this.url, tileLayer.url) &&
        Objects.equals(this.dataSource, tileLayer.dataSource) &&
        Objects.equals(this.domains, tileLayer.domains) &&
        Objects.equals(this.minZoom, tileLayer.minZoom) &&
        Objects.equals(this.maxZoom, tileLayer.maxZoom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descripton, tags, icon, image, url, dataSource, domains, minZoom, maxZoom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TileLayer {\n");
    
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

