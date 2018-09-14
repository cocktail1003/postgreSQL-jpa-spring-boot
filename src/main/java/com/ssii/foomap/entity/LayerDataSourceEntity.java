package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:LayerDataSourceEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 17:17
 */
@Entity
@Table(name = "layer_data_source")
public class LayerDataSourceEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "layer_id")
    private int layerId;
    @Column(name = "layer_type")
    private String layerType;
    @Column(name = "source_id")
    private int sourceId;

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

    public String getLayerType() {
        return layerType;
    }

    public void setLayerType(String layerType) {
        this.layerType = layerType;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }
}
