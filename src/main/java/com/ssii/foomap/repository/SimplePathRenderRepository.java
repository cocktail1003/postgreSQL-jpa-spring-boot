package com.ssii.foomap.repository;

import com.ssii.foomap.entity.SimplePathRenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:SimplePathRenderRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:44
 */
@Repository
public interface SimplePathRenderRepository extends JpaRepository<SimplePathRenderEntity,Integer>{
}
