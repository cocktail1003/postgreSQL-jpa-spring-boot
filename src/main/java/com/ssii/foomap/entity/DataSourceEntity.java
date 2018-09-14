package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:DataSourceEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 17:26
 */
@Entity
@Table(name = "data_source")
public class DataSourceEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "query_fileds")
    private String[] queryFileds;
    @Column(name = "popup_fileds")
    private String[] popupFileds;
    @Column(name = "general_fileds")
    private String[] generalFileds;


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

    public String[] getQueryFileds() {
        return queryFileds;
    }

    public void setQueryFileds(String[] queryFileds) {
        this.queryFileds = queryFileds;
    }

    public String[] getPopupFileds() {
        return popupFileds;
    }

    public void setPopupFileds(String[] popupFileds) {
        this.popupFileds = popupFileds;
    }

    public String[] getGeneralFileds() {
        return generalFileds;
    }

    public void setGeneralFileds(String[] generalFileds) {
        this.generalFileds = generalFileds;
    }
}
