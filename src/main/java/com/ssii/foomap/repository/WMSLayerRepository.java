package com.ssii.foomap.repository;

import com.ssii.foomap.entity.WMSLayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:WMSLayerRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:48
 */
@Repository
public interface WMSLayerRepository extends JpaRepository<WMSLayerEntity,Integer>{
}
