package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:ImageEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 11:35
 */
@Entity
@Table(name = "image")
public class ImageEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "size")
    private int[] size;

    @Column(name = "drawable")
    private String drawable;

    @Column(name = "drawable_hover")
    private String drawableHover;

    @Column(name = "drawable_selected")
    private String drawableSelected;

    @Column(name = "drawable_disable")
    private String drawableDisable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public String getDrawable() {
        return drawable;
    }

    public void setDrawable(String drawable) {
        this.drawable = drawable;
    }

    public String getDrawableHover() {
        return drawableHover;
    }

    public void setDrawableHover(String drawableHover) {
        this.drawableHover = drawableHover;
    }

    public String getDrawableSelected() {
        return drawableSelected;
    }

    public void setDrawableSelected(String drawableSelected) {
        this.drawableSelected = drawableSelected;
    }

    public String getDrawableDisable() {
        return drawableDisable;
    }

    public void setDrawableDisable(String drawableDisable) {
        this.drawableDisable = drawableDisable;
    }
}
