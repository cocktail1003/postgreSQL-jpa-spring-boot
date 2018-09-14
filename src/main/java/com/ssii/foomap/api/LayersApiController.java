package com.ssii.foomap.api;

import com.ssii.foomap.entity.GeoJsonLayerEntity;
import com.ssii.foomap.model.JsonLayer;
import com.ssii.foomap.model.LayerSet;
import com.ssii.foomap.model.TileLayer;
import com.ssii.foomap.model.WMSLayer;
import com.ssii.foomap.model.WMTSLayer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssii.foomap.service.ILayerService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Controller
public class LayersApiController implements LayersApi {
    @Autowired
    ILayerService layerService;

    private static final Logger log = LoggerFactory.getLogger(LayersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LayersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<JsonLayer> addGeoJSONLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody JsonLayer layer) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<TileLayer> addTMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody TileLayer layer) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<WMSLayer> addWMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody WMSLayer layer) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<WMTSLayer> addWMTSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody WMTSLayer layer) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<Boolean> deleteGeoJSONLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Boolean>(objectMapper.readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> deleteTMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Boolean>(objectMapper.readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> deleteWMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Boolean>(objectMapper.readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> deleteWMTSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Boolean>(objectMapper.readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeoJsonLayerEntity> getGeoJSONLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                                              @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<List<JsonLayer>> getGeoJSONLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<LayerSet> getLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration) {
        return ResponseEntity.ok(layerService.getLayers());
    }

    public ResponseEntity<TileLayer> getTMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<List<TileLayer>> getTMSLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<WMSLayer> getWMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<List<WMSLayer>> getWMSLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<WMTSLayer> getWMTSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<List<WMTSLayer>> getWMTSLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<JsonLayer> updateGeoJSONLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody JsonLayer layer) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<TileLayer> updateTMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody TileLayer layer) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<WMSLayer> updateWMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody WMSLayer layer) {
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<WMTSLayer> updateWMTSLayer(@ApiParam(value = "用户登录成功后的Token", required = true)@RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody WMTSLayer layer) {
        return ResponseEntity.ok(null);
    }
}
