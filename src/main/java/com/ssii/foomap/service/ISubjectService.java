package com.ssii.foomap.service;

import com.ssii.foomap.entity.SubjectEntity;
import com.ssii.foomap.entity.SubjectLayerEntity;

/**
 * Name:ISubjectService
 * Description:
 * Author:yxc
 * Time: 2018/9/14 10:02
 */
public interface ISubjectService {
    SubjectEntity addSubject(SubjectEntity subject);
    boolean addSubjectLayer(int id,SubjectLayerEntity subjectLayer);
    boolean delSubject(int id);
    boolean delSubjectLayer(int id,int LayerId,String LayerType);
}
