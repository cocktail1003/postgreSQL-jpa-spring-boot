package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:GeoJsonRenderEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/13 09:49
 */
@Entity
@Table(name = "geo_json_render")
public class GeoJsonRenderEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "geo_json_layer_id")
    private int geoJsonLayerId;
    @Column(name = "render_id")
    private int renderId;
    @Column(name = "render_type")
    private String renderType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGeoJsonLayerId() {
        return geoJsonLayerId;
    }

    public void setGeoJsonLayerId(int geoJsonLayerId) {
        this.geoJsonLayerId = geoJsonLayerId;
    }

    public int getRenderId() {
        return renderId;
    }

    public void setRenderId(int renderId) {
        this.renderId = renderId;
    }

    public String getRenderType() {
        return renderType;
    }

    public void setRenderType(String renderType) {
        this.renderType = renderType;
    }
}
