package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:DataSourceFiledEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 17:13
 */
@Entity
@Table(name = "data_source_filed")
public class DataSourceFiledEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "lable")
    private String lable;
    @Column(name = "type")
    private String type;
    @Column(name = "source_name")
    private String sourceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
}
