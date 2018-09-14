package com.ssii.foomap.service;

import com.ssii.foomap.entity.TileLayerEntity;
import com.ssii.foomap.model.Layer;
import com.ssii.foomap.model.LayerSet;
import com.ssii.foomap.repository.TileLayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Name:LayerService
 * Description:
 * Author:yxc
 * Time: 2018/9/14 14:09
 */
@Service
public class LayerService implements ILayerService {
    @Autowired
    TileLayerRepository tileLayerRepository;

    @Override
    public LayerSet getLayers() {
        LayerSet result = new LayerSet();
        List<Layer> layers = new ArrayList<>();
        List<TileLayerEntity> tileLayers = tileLayerRepository.findAll();
        for (TileLayerEntity t : tileLayers){
            Layer layer = new Layer();
            layer.setId(t.getId());
            layer.setDescripton(t.getDescription());
            layer.setDomains(t.getSubdomains());
            layer.setType(Layer.TypeEnum.TMS);
            layer.setUrl(t.getUrl());
            layers.add(layer);
        }
        result.setBasemaps(layers);
        return result;
    }
}
