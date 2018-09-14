package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:UniqueIconRenderEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 17:33
 */
@Entity
@Table(name = "unique_icon_render")
public class UniqueIconRenderEntity {

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
