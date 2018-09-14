package com.ssii.foomap.service;

import com.ssii.foomap.common.core.GraceException;
import com.ssii.foomap.entity.BaseMapEntity;
import com.ssii.foomap.repository.BaseMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Name:BaseMapService
 * Description:
 * Author:yxc
 * Time: 2018/9/13 14:49
 */
@Service
public class BaseMapService implements IBaseMapService {
    @Autowired
    BaseMapRepository baseMapRepository;

    @Override
    public BaseMapEntity addBasemapLayer(BaseMapEntity baseMapEntity) {
        if (baseMapEntity != null) {
            return baseMapRepository.save(baseMapEntity);
        }
        throw new GraceException(422, "数据不完整");
    }

    @Override
    public BaseMapEntity updateBasemapLayer(BaseMapEntity baseMap) {
        BaseMapEntity result = baseMapRepository.findByLayerIdAndLayerType(baseMap.getLayerId(), baseMap.getLayerType());
        if (result != null) {
            result.setIndex(baseMap.getIndex());
            return baseMapRepository.save(result);
        }
        throw new GraceException(422, "不存在该地图层");
    }

    @Override
    public boolean delBasemapLayer(int id) {
        BaseMapEntity baseMapEntity = baseMapRepository.getOne(id);
        if (baseMapEntity != null) {
            baseMapRepository.delete(baseMapEntity);
            return true;
        }
        return false;
    }

    @Override
    public List<BaseMapEntity> getBasemaps() {
        return baseMapRepository.findAll();
    }
}
