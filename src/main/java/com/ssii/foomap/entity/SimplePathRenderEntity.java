package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:SimplePathRenderEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/13 09:46
 */
@Entity
@Table(name = "simple_path_render")
public class SimplePathRenderEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "path_render_id")
    private int pathRenderId;
    @Column(name = "property_value")
    private String propertyValue;
    @Column(name = "path_symbol_ids")
    private int[] pathSymbolIds;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPathRenderId() {
        return pathRenderId;
    }

    public void setPathRenderId(int pathRenderId) {
        this.pathRenderId = pathRenderId;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public int[] getPathSymbolIds() {
        return pathSymbolIds;
    }

    public void setPathSymbolIds(int[] pathSymbolIds) {
        this.pathSymbolIds = pathSymbolIds;
    }
}
