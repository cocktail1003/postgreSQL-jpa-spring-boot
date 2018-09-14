package com.ssii.foomap.repository;

import com.ssii.foomap.entity.SimpleIconRenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:SimpleIconRenderRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:43
 */
@Repository
public interface SimpleIconRenderRepository extends JpaRepository<SimpleIconRenderEntity,Integer>{
}
