package com.ssii.foomap.repository;

import com.ssii.foomap.entity.MapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:MapRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:42
 */
@Repository
public interface MapRepository extends JpaRepository<MapEntity,Integer>{
}
