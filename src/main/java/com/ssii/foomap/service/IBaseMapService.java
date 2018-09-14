package com.ssii.foomap.service;

import com.ssii.foomap.entity.BaseMapEntity;

import java.util.List;

/**
 * Name:IBaseMapService
 * Description:
 * Author:yxc
 * Time: 2018/9/13 14:49
 */
public interface IBaseMapService {
    BaseMapEntity addBasemapLayer(BaseMapEntity baseMapEntity);
    BaseMapEntity updateBasemapLayer(BaseMapEntity baseMapEntity);
    boolean delBasemapLayer(int id);
    List<BaseMapEntity> getBasemaps();
}
