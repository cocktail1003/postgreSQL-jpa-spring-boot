package com.ssii.foomap.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * Name:MapEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 10:02
 */
@Entity
@Table(name = "map")
@ApiModel
public class MapEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "bounds_x")
    @ApiModelProperty(example = "[23.23,24.56]", value = "")
    private float[] boundsX;
    @Column(name = "bounds_y")
    @ApiModelProperty(example = "[112.34,112.46]", value = "")
    private float[] boundsY;
    @Column(name = "zoom")
    @ApiModelProperty(value = "默认绽放级别")
    private int zoom;
    @Column(name = "center")
    @ApiModelProperty(example = "[22.345,112.234]", value = "")
    private float[] center;
    @Column(name = "crs_code")
    @ApiModelProperty(example = "EPSG:4326", value = "地图坐标系统编码，EPSG编码")
    private String crsCode;
    @Column(name = "crs_name")
    @ApiModelProperty(value = "地图坐标系统名称")
    private String crsName;
    @Column(name = "crs_text")
    @ApiModelProperty(value = "地图坐标系统的定义文字，Leaflet默认支持的坐标系统以外的坐标系统提供")
    private String crsText;
    @Column(name = "resolution")
    @ApiModelProperty(value = "分辨率")
    private String resolution;
    @Column(name = "origin")
    @ApiModelProperty(value = "坐标原点，偏移量等")
    private float[] origin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float[] getBoundsX() {
        return boundsX;
    }

    public void setBoundsX(float[] boundsX) {
        this.boundsX = boundsX;
    }

    public float[] getBoundsY() {
        return boundsY;
    }

    public void setBoundsY(float[] boundsY) {
        this.boundsY = boundsY;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public float[] getCenter() {
        return center;
    }

    public void setCenter(float[] center) {
        this.center = center;
    }

    public String getCrsCode() {
        return crsCode;
    }

    public void setCrsCode(String crsCode) {
        this.crsCode = crsCode;
    }

    public String getCrsName() {
        return crsName;
    }

    public void setCrsName(String crsName) {
        this.crsName = crsName;
    }

    public String getCrsText() {
        return crsText;
    }

    public void setCrsText(String crsText) {
        this.crsText = crsText;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public float[] getOrigin() {
        return origin;
    }

    public void setOrigin(float[] origin) {
        this.origin = origin;
    }
}
