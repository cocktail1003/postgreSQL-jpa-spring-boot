package com.ssii.foomap.repository;

import com.ssii.foomap.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:ImageRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:41
 */
@Repository
public interface ImageRepository extends JpaRepository<ImageEntity,Integer>{
}
