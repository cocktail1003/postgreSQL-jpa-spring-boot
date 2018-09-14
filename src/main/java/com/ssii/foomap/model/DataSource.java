package com.ssii.foomap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.ssii.foomap.model.DataSourceField;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * 源数据
 */
@ApiModel(description = "源数据")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

public class DataSource   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("fields")
  @Valid
  private List<DataSourceField> fields = null;

  @JsonProperty("editableFields")
  @Valid
  private List<String> editableFields = null;

  @JsonProperty("queryFields")
  @Valid
  private List<String> queryFields = null;

  @JsonProperty("generalFields")
  @Valid
  private List<DataSourceField> generalFields = null;

  @JsonProperty("popupFields")
  @Valid
  private List<DataSourceField> popupFields = null;

  public DataSource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 源数据名称，对应空间数据表名
   * @return name
  **/
  @ApiModelProperty(value = "源数据名称，对应空间数据表名")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataSource fields(List<DataSourceField> fields) {
    this.fields = fields;
    return this;
  }

  public DataSource addFieldsItem(DataSourceField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<DataSourceField>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * 在系统里可以显示的字段
   * @return fields
  **/
  @ApiModelProperty(value = "在系统里可以显示的字段")

  @Valid

  public List<DataSourceField> getFields() {
    return fields;
  }

  public void setFields(List<DataSourceField> fields) {
    this.fields = fields;
  }

  public DataSource editableFields(List<String> editableFields) {
    this.editableFields = editableFields;
    return this;
  }

  public DataSource addEditableFieldsItem(String editableFieldsItem) {
    if (this.editableFields == null) {
      this.editableFields = new ArrayList<String>();
    }
    this.editableFields.add(editableFieldsItem);
    return this;
  }

  /**
   * 可以编辑的字段
   * @return editableFields
  **/
  @ApiModelProperty(value = "可以编辑的字段")


  public List<String> getEditableFields() {
    return editableFields;
  }

  public void setEditableFields(List<String> editableFields) {
    this.editableFields = editableFields;
  }

  public DataSource queryFields(List<String> queryFields) {
    this.queryFields = queryFields;
    return this;
  }

  public DataSource addQueryFieldsItem(String queryFieldsItem) {
    if (this.queryFields == null) {
      this.queryFields = new ArrayList<String>();
    }
    this.queryFields.add(queryFieldsItem);
    return this;
  }

  /**
   * 作为关键词进行查询的字段
   * @return queryFields
  **/
  @ApiModelProperty(value = "作为关键词进行查询的字段")


  public List<String> getQueryFields() {
    return queryFields;
  }

  public void setQueryFields(List<String> queryFields) {
    this.queryFields = queryFields;
  }

  public DataSource generalFields(List<DataSourceField> generalFields) {
    this.generalFields = generalFields;
    return this;
  }

  public DataSource addGeneralFieldsItem(DataSourceField generalFieldsItem) {
    if (this.generalFields == null) {
      this.generalFields = new ArrayList<DataSourceField>();
    }
    this.generalFields.add(generalFieldsItem);
    return this;
  }

  /**
   * 简要信息字段，在查询列表中显示的字段
   * @return generalFields
  **/
  @ApiModelProperty(value = "简要信息字段，在查询列表中显示的字段")

  @Valid

  public List<DataSourceField> getGeneralFields() {
    return generalFields;
  }

  public void setGeneralFields(List<DataSourceField> generalFields) {
    this.generalFields = generalFields;
  }

  public DataSource popupFields(List<DataSourceField> popupFields) {
    this.popupFields = popupFields;
    return this;
  }

  public DataSource addPopupFieldsItem(DataSourceField popupFieldsItem) {
    if (this.popupFields == null) {
      this.popupFields = new ArrayList<DataSourceField>();
    }
    this.popupFields.add(popupFieldsItem);
    return this;
  }

  /**
   * 在地图popup中显示的字段
   * @return popupFields
  **/
  @ApiModelProperty(value = "在地图popup中显示的字段")

  @Valid

  public List<DataSourceField> getPopupFields() {
    return popupFields;
  }

  public void setPopupFields(List<DataSourceField> popupFields) {
    this.popupFields = popupFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSource dataSource = (DataSource) o;
    return Objects.equals(this.name, dataSource.name) &&
        Objects.equals(this.fields, dataSource.fields) &&
        Objects.equals(this.editableFields, dataSource.editableFields) &&
        Objects.equals(this.queryFields, dataSource.queryFields) &&
        Objects.equals(this.generalFields, dataSource.generalFields) &&
        Objects.equals(this.popupFields, dataSource.popupFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fields, editableFields, queryFields, generalFields, popupFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    editableFields: ").append(toIndentedString(editableFields)).append("\n");
    sb.append("    queryFields: ").append(toIndentedString(queryFields)).append("\n");
    sb.append("    generalFields: ").append(toIndentedString(generalFields)).append("\n");
    sb.append("    popupFields: ").append(toIndentedString(popupFields)).append("\n");
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

