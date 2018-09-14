package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.DataSource;
import com.ssii.foomap.model.Image;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * 图层基础信息
 */
@ApiModel(description = "图层基础信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class Layer   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("descripton")
  private String descripton = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("index")
  private Integer index = null;

  /**
   * 图层类型
   */
  public enum TypeEnum {
    WMS("wms"),
    
    WMTS("wmts"),
    
    TMS("tms"),
    
    GEOJSON("geojson");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

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

  public Layer id(Integer id) {
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

  public Layer name(String name) {
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

  public Layer descripton(String descripton) {
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

  public Layer tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Layer addTagsItem(String tagsItem) {
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

  public Layer index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * 图层在专题中的排序
   * @return index
  **/
  @ApiModelProperty(value = "图层在专题中的排序")


  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Layer type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * 图层类型
   * @return type
  **/
  @ApiModelProperty(value = "图层类型")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Layer icon(Image icon) {
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

  public Layer image(Image image) {
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

  public Layer url(String url) {
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

  public Layer dataSource(DataSource dataSource) {
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

  public Layer domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public Layer addDomainsItem(String domainsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Layer layer = (Layer) o;
    return Objects.equals(this.id, layer.id) &&
        Objects.equals(this.name, layer.name) &&
        Objects.equals(this.descripton, layer.descripton) &&
        Objects.equals(this.tags, layer.tags) &&
        Objects.equals(this.index, layer.index) &&
        Objects.equals(this.type, layer.type) &&
        Objects.equals(this.icon, layer.icon) &&
        Objects.equals(this.image, layer.image) &&
        Objects.equals(this.url, layer.url) &&
        Objects.equals(this.dataSource, layer.dataSource) &&
        Objects.equals(this.domains, layer.domains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descripton, tags, index, type, icon, image, url, dataSource, domains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Layer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descripton: ").append(toIndentedString(descripton)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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

