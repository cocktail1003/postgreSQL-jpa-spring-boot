package com.ssii.foomap.repository;

import com.ssii.foomap.entity.GeoJsonRenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:GeoJsonRenderRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:39
 */
@Repository
public interface GeoJsonRenderRepository extends JpaRepository<GeoJsonRenderEntity,Integer>{
}
