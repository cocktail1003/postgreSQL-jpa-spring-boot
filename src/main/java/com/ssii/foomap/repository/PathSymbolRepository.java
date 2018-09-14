package com.ssii.foomap.repository;

import com.ssii.foomap.entity.PathSymbolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:PathSymbolRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:43
 */
@Repository
public interface PathSymbolRepository extends JpaRepository<PathSymbolEntity,Integer> {
}
