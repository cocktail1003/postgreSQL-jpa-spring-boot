package com.ssii.foomap.repository;

import com.ssii.foomap.entity.GeoJsonLayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:GeoJsonLayerRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:39
 */
@Repository
public interface GeoJsonLayerRepository extends JpaRepository<GeoJsonLayerEntity,Integer>{
}
