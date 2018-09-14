package com.ssii.foomap.repository;

import com.ssii.foomap.entity.DataSourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:DataSourceRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:36
 */
@Repository
public interface DataSourceRepository extends JpaRepository<DataSourceEntity,Integer>{
}
