package com.ssii.foomap.repository;

import com.ssii.foomap.entity.WMTSlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:WMTSlayerRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:49
 */
@Repository
public interface WMTSlayerRepository extends JpaRepository<WMTSlayerEntity,Integer>{
}
