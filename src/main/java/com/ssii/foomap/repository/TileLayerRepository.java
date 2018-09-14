package com.ssii.foomap.repository;

import com.ssii.foomap.entity.TileLayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:TileLayerRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:46
 */
@Repository
public interface TileLayerRepository extends JpaRepository<TileLayerEntity,Integer>{
}
