package com.ssii.foomap.repository;

import com.ssii.foomap.entity.SubjectLayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Name:SubjectLayerRepository
 * Description:
 * Author:yxc
 * Time: 2018/9/13 11:46
 */
@Repository
public interface SubjectLayerRepository extends JpaRepository<SubjectLayerEntity,Integer>{
    void deleteAllBySubjectId(int id);
    SubjectLayerEntity findBySubjectIdAndLayerIdAndLayerType(int id,int layerId,String layerType);
}
