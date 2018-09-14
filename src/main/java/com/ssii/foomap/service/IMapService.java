package com.ssii.foomap.service;

import com.ssii.foomap.entity.MapEntity;

/**
 * Name:IMapService
 * Description:
 * Author:yxc
 * Time: 2018/9/13 14:05
 */
public interface IMapService {
    MapEntity setMapConfigs(MapEntity mapConfig);
    MapEntity getMapConfigs();
}
