package com.ssii.foomap.repository;

import com.ssii.foomap.entity.UniqueIconRenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:UniqueIconRenderRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:47
 */
@Repository
public interface UniqueIconRenderRepository extends JpaRepository<UniqueIconRenderEntity,InternalError>{
}
