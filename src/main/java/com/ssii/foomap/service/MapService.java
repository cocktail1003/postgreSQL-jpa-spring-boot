package com.ssii.foomap.service;

import com.ssii.foomap.common.core.GraceException;
import com.ssii.foomap.entity.MapEntity;
import com.ssii.foomap.repository.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Name:MapService
 * Description:
 * Author:yxc
 * Time: 2018/9/13 14:05
 */
@Service
public class MapService implements IMapService {
    @Autowired
    MapRepository mapRepository;

    @Override
    public MapEntity setMapConfigs(MapEntity mapConfig) {
        if (mapConfig != null) {
            return mapRepository.save(mapConfig);
        }
        throw new GraceException(422, "数据不完整");
    }

    @Override
    public MapEntity getMapConfigs() {
        List<MapEntity> maps = mapRepository.findAll();
        if (maps.size() > 0) {
            return maps.get(0);
        }
        return null;
    }
}
