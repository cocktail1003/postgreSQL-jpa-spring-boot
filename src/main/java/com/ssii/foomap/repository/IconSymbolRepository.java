package com.ssii.foomap.repository;

import com.ssii.foomap.entity.IconSymbolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:IconSymbolRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:40
 */
@Repository
public interface IconSymbolRepository extends JpaRepository<IconSymbolEntity,Integer>{
}
