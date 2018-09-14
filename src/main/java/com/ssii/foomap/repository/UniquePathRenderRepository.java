package com.ssii.foomap.repository;

import com.ssii.foomap.entity.UniquePathRenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:UniquePathRenderRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:48
 */
@Repository
public interface UniquePathRenderRepository extends JpaRepository<UniquePathRenderEntity,Integer>{
}
