package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:UniquePathRenderEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/13 09:35
 */
@Entity
@Table(name = "unique_path_render")
public class UniquePathRenderEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "property")
    private String property;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
