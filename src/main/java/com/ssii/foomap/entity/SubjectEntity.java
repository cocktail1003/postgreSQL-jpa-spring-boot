package com.ssii.foomap.entity;

import javax.persistence.*;

/**
 * Name:Subject
 * Description:
 * Author:yxc
 * Time: 2018/9/12 14:15
 */
@Entity
@Table(name = "subject")
public class SubjectEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "tags")
    private String[] tags;
//    @Column(name = "icon")
//    private int  icon;
//    @Column(name = "image")
//    private int image;
    @Column(name = "index")
    private int index;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示Image不能为空
    @JoinColumn(name="image_id",insertable = false,updatable = false)//设置在Image表中的关联字段(外键)
    private ImageEntity icon;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示Image不能为空
    @JoinColumn(name="image_id",insertable = false,updatable = false)//设置在Image表中的关联字段(外键)
    private ImageEntity image;


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

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ImageEntity getIcon() {
        return icon;
    }

    public void setIcon(ImageEntity icon) {
        this.icon = icon;
    }

    public ImageEntity getImage() {
        return image;
    }

    public void setImage(ImageEntity image) {
        this.image = image;
    }
}
