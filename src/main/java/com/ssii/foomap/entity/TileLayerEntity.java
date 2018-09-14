package com.ssii.foomap.entity;

import com.ssii.foomap.common.util.ListToArrayConveter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Name:TileLayerEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 16:45
 */
@Entity
@Table(name = "tile_layer")
public class TileLayerEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "tags", columnDefinition = "text[]")
    @Convert(converter = ListToArrayConveter.class)
    private List<String> tags;

    @Column(name = "icon")
    private int icon;

    @Column(name = "image")
    private int image;

    @Column(name = "url")
    private String url;
    @Column(name = "index")
    private int index;
    @Column(name = "subdomains", columnDefinition = "text[]")
    @Convert(converter = ListToArrayConveter.class)
    private List<String> subdomains;
    @Column(name = "min_zoom")
    private int minZoom;
    @Column(name = "max_zoom")
    private int maxZoom;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getMinZoom() {
        return minZoom;
    }

    public void setMinZoom(int minZoom) {
        this.minZoom = minZoom;
    }

    public int getMaxZoom() {
        return maxZoom;
    }

    public void setMaxZoom(int maxZoom) {
        this.maxZoom = maxZoom;
    }

    public List<String> getSubdomains() {
        return subdomains;
    }

    public void setSubdomains(List<String> subdomains) {
        this.subdomains = subdomains;
    }
}
