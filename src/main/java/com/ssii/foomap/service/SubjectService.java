package com.ssii.foomap.service;

import com.ssii.foomap.common.core.GraceException;
import com.ssii.foomap.entity.SubjectEntity;
import com.ssii.foomap.entity.SubjectLayerEntity;
import com.ssii.foomap.repository.SubjectLayerRepository;
import com.ssii.foomap.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Name:SubjectService
 * Description:
 * Author:yxc
 * Time: 2018/9/14 10:03
 */
@Service
public class SubjectService implements ISubjectService{
    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    SubjectLayerRepository subjectLayerRepository;

    @Override
    public SubjectEntity addSubject(SubjectEntity subject) {
        if (subject!=null){
            return subjectRepository.save(subject);
        }
        throw new GraceException(422,"数据不完整");
    }

    @Override
    public boolean addSubjectLayer(int id,SubjectLayerEntity subjectLayer) {
        SubjectEntity subject = subjectRepository.getOne(id);
        if (subject!=null&&subjectLayer!=null){
            subjectLayer.setSubjectId(id);
            SubjectLayerEntity result = subjectLayerRepository.save(subjectLayer);
            if (result!=null){
                return true;
            }
            return false;
        }
        throw new GraceException(422,"数据不完整");
    }

    @Override
    @Transactional
    public boolean delSubject(int id) {
        SubjectEntity subject = subjectRepository.getOne(id);
        if (subject!=null) {
            subjectLayerRepository.deleteAllBySubjectId(id);
            subjectRepository.delete(subject);
            return true;
        }
        throw new GraceException(422,"数据错误，该专题不存在");
    }

    @Override
    public boolean delSubjectLayer(int id, int LayerId, String LayerType) {
        SubjectLayerEntity subjectLayer = subjectLayerRepository.findBySubjectIdAndLayerIdAndLayerType(id,LayerId,LayerType);
        if (subjectLayer!=null){
            subjectLayerRepository.delete(subjectLayer);
            return true;
        }
        throw new GraceException(422,"数据错误，该专题图层不存在");
    }
}
