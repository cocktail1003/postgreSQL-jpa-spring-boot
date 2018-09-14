package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:PathSymbolEntity
 * Description:
 * Author:yxc
 * Time: 2018/9/12 15:01
 */
@Entity
@Table(name = "path_symbol")
public class PathSymbolEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "radius")
    private int radius;
    @Column(name = "stroke")
    private boolean stroke;
    @Column(name = "color")
    private String color;
    @Column(name = "weight")
    private int weight;
    @Column(name = "opacity")
    private float opacity;
    @Column(name = "line_cap")
    private String lineCap;
    @Column(name = "line_join")
    private String lineJoin;
    @Column(name = "dash_array")
    private String dashArray;
    @Column(name = "dash_offset")
    private String dashOffset;
    @Column(name = "fill")
    private boolean fill;
    @Column(name = "fill_color")
    private String fillColor;
    @Column(name = "fill_opacity")
    private float fillOpacity;
    @Column(name = "fill_rule")
    private String fillRule;
    @Column(name = "bubbling_mouse_events")
    private boolean bubblingMouseEvents;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isStroke() {
        return stroke;
    }

    public void setStroke(boolean stroke) {
        this.stroke = stroke;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getOpacity() {
        return opacity;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    public String getLineCap() {
        return lineCap;
    }

    public void setLineCap(String lineCap) {
        this.lineCap = lineCap;
    }

    public String getLineJoin() {
        return lineJoin;
    }

    public void setLineJoin(String lineJoin) {
        this.lineJoin = lineJoin;
    }

    public String getDashArray() {
        return dashArray;
    }

    public void setDashArray(String dashArray) {
        this.dashArray = dashArray;
    }

    public String getDashOffset() {
        return dashOffset;
    }

    public void setDashOffset(String dashOffset) {
        this.dashOffset = dashOffset;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public float getFillOpacity() {
        return fillOpacity;
    }

    public void setFillOpacity(float fillOpacity) {
        this.fillOpacity = fillOpacity;
    }

    public String getFillRule() {
        return fillRule;
    }

    public void setFillRule(String fillRule) {
        this.fillRule = fillRule;
    }

    public boolean isBubblingMouseEvents() {
        return bubblingMouseEvents;
    }

    public void setBubblingMouseEvents(boolean bubblingMouseEvents) {
        this.bubblingMouseEvents = bubblingMouseEvents;
    }
}
