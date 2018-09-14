package com.ssii.foomap.repository;

import com.ssii.foomap.entity.BaseMapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:BaseMapRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:33
 */
@Repository
public interface BaseMapRepository extends JpaRepository<BaseMapEntity,Integer>{
    BaseMapEntity findByLayerIdAndLayerType(int layerId,String layerType);
}
