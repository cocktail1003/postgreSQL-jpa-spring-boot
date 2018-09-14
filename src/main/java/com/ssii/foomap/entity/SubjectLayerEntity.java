package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:SubjectLayerEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 17:05
 */
@Entity
@Table(name = "subject_layer")
public class SubjectLayerEntity {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "layer_id")
    private int layerId;
    @Column(name = "layer_type")
    private String layerType;
    @Column(name = "index")
    private int index;
    @Column(name = "subject_id")
    private int subjectId;

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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
}
