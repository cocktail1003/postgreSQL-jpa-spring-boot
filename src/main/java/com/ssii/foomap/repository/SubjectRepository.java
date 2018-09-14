package com.ssii.foomap.repository;

import com.ssii.foomap.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:SubjectRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:45
 */
@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity,Integer>{
}
