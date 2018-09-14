package com.ssii.foomap.repository;

import com.ssii.foomap.entity.DataSourceFiledEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:DataSourceFiledRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:36
 */
@Repository
public interface DataSourceFiledRepository extends JpaRepository<DataSourceFiledEntity,Integer>{
}
