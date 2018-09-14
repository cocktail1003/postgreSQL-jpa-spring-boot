package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:SimpleIconRenderEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/13 09:18
 */
@Entity
@Table(name = "simple_icon_render")
public class SimpleIconRenderEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "icon_render_id")
    private int iconRenderId;
    @Column(name = "property_value")
    private String propertyValue;
    @Column(name = "icon_symbol_ids")
    private int[] iconSymbolIds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIconRenderId() {
        return iconRenderId;
    }

    public void setIconRenderId(int iconRenderId) {
        this.iconRenderId = iconRenderId;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public int[] getIconSymbolIds() {
        return iconSymbolIds;
    }

    public void setIconSymbolIds(int[] iconSymbolIds) {
        this.iconSymbolIds = iconSymbolIds;
    }
}
