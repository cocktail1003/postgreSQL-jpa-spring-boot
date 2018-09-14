package com.ssii.foomap.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * Name:BaseMapEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 17:09
 */

@Entity
@Table(name = "base_map")
@ApiModel
public class BaseMapEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "layer_id")
    @ApiModelProperty(value = "图层编号")
    private int layerId;
    @Column(name = "index")
    @ApiModelProperty(value = "图层在专题中的排序")
    private int index;
    @Column(name = "layer_type")
    @ApiModelProperty(value = "图层类型 tms wms wmts geojson")
    private String layerType;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLayerId() {
        return layerId;
    }

    public void setLayerId(int layerId) {
        this.layerId = layerId;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getLayerType() {
        return layerType;
    }

    public void setLayerType(String layerType) {
        this.layerType = layerType;
    }
}
