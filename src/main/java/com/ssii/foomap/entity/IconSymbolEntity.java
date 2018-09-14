package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:IconSymbolEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 14:54
 */
@Entity
@Table(name = "icon_symbol")
public class IconSymbolEntity {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "icon_url")
    private String iconUrl;
    @Column(name = "icon_size")
    private int[] iconSize;
    @Column(name = "icon_anchor")
    private  int[] iconAnchor;
    @Column(name = "shadow_url")
    private String shadowUrl;
    @Column(name = "shadow_size")
    private int[] shadowSize;
    @Column(name = "shadow_anchor")
    private int[] shadowAnchor;
    @Column(name = "popup_anchor")
    private int[] popupAnchor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public int[] getIconSize() {
        return iconSize;
    }

    public void setIconSize(int[] iconSize) {
        this.iconSize = iconSize;
    }

    public int[] getIconAnchor() {
        return iconAnchor;
    }

    public void setIconAnchor(int[] iconAnchor) {
        this.iconAnchor = iconAnchor;
    }

    public String getShadowUrl() {
        return shadowUrl;
    }

    public void setShadowUrl(String shadowUrl) {
        this.shadowUrl = shadowUrl;
    }

    public int[] getShadowSize() {
        return shadowSize;
    }

    public void setShadowSize(int[] shadowSize) {
        this.shadowSize = shadowSize;
    }

    public int[] getShadowAnchor() {
        return shadowAnchor;
    }

    public void setShadowAnchor(int[] shadowAnchor) {
        this.shadowAnchor = shadowAnchor;
    }

    public int[] getPopupAnchor() {
        return popupAnchor;
    }

    public void setPopupAnchor(int[] popupAnchor) {
        this.popupAnchor = popupAnchor;
    }
}
