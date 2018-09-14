package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.Layer;
import com.ssii.foomap.model.Subject;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * 图层集合，包包基础图层与专题图层的配制信息
 */
@ApiModel(description = "图层集合，包包基础图层与专题图层的配制信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class LayerSet   {
  @JsonProperty("basemaps")
  @Valid
  private List<Layer> basemaps = null;

  @JsonProperty("subjects")
  @Valid
  private List<Subject> subjects = null;

  public LayerSet basemaps(List<Layer> basemaps) {
    this.basemaps = basemaps;
    return this;
  }

  public LayerSet addBasemapsItem(Layer basemapsItem) {
    if (this.basemaps == null) {
      this.basemaps = new ArrayList<Layer>();
    }
    this.basemaps.add(basemapsItem);
    return this;
  }

  /**
   * 基础图
   * @return basemaps
  **/
  @ApiModelProperty(value = "基础图")

  @Valid

  public List<Layer> getBasemaps() {
    return basemaps;
  }

  public void setBasemaps(List<Layer> basemaps) {
    this.basemaps = basemaps;
  }

  public LayerSet subjects(List<Subject> subjects) {
    this.subjects = subjects;
    return this;
  }

  public LayerSet addSubjectsItem(Subject subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new ArrayList<Subject>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

  /**
   * 专题地图，专题数据
   * @return subjects
  **/
  @ApiModelProperty(value = "专题地图，专题数据")

  @Valid

  public List<Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<Subject> subjects) {
    this.subjects = subjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayerSet layerSet = (LayerSet) o;
    return Objects.equals(this.basemaps, layerSet.basemaps) &&
        Objects.equals(this.subjects, layerSet.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basemaps, subjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayerSet {\n");
    
    sb.append("    basemaps: ").append(toIndentedString(basemaps)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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

