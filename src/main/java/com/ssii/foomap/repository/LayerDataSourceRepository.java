package com.ssii.foomap.repository;

import com.ssii.foomap.entity.LayerDataSourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:LayerDataSourceRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:41
 */
@Repository
public interface LayerDataSourceRepository extends JpaRepository<LayerDataSourceEntity,Integer>{
}
