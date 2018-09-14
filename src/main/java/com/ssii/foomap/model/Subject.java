package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.Image;
import com.ssii.foomap.model.Layer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * 专题对象，地图专题
 */
@ApiModel(description = "专题对象，地图专题")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class Subject   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("icon")
  private Image icon = null;

  @JsonProperty("image")
  private Image image = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("layers")
  @Valid
  private List<Layer> layers = null;

  public Subject id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * 专题编号
   * @return id
  **/
  @ApiModelProperty(value = "专题编号")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Subject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 专题名称
   * @return name
  **/
  @ApiModelProperty(value = "专题名称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Subject description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 专题描述
   * @return description
  **/
  @ApiModelProperty(value = "专题描述")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Subject tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Subject addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * 专题标签描述
   * @return tags
  **/
  @ApiModelProperty(value = "专题标签描述")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Subject icon(Image icon) {
    this.icon = icon;
    return this;
  }

  /**
   * 专题图标
   * @return icon
  **/
  @ApiModelProperty(value = "专题图标")

  @Valid

  public Image getIcon() {
    return icon;
  }

  public void setIcon(Image icon) {
    this.icon = icon;
  }

  public Subject image(Image image) {
    this.image = image;
    return this;
  }

  /**
   * 专题图片
   * @return image
  **/
  @ApiModelProperty(value = "专题图片")

  @Valid

  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public Subject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * 专题排序
   * @return index
  **/
  @ApiModelProperty(value = "专题排序")


  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Subject layers(List<Layer> layers) {
    this.layers = layers;
    return this;
  }

  public Subject addLayersItem(Layer layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<Layer>();
    }
    this.layers.add(layersItem);
    return this;
  }

  /**
   * Get layers
   * @return layers
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Layer> getLayers() {
    return layers;
  }

  public void setLayers(List<Layer> layers) {
    this.layers = layers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subject subject = (Subject) o;
    return Objects.equals(this.id, subject.id) &&
        Objects.equals(this.name, subject.name) &&
        Objects.equals(this.description, subject.description) &&
        Objects.equals(this.tags, subject.tags) &&
        Objects.equals(this.icon, subject.icon) &&
        Objects.equals(this.image, subject.image) &&
        Objects.equals(this.index, subject.index) &&
        Objects.equals(this.layers, subject.layers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tags, icon, image, index, layers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
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

