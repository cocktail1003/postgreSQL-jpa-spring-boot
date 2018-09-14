package com.ssii.foomap.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssii.foomap.entity.MapEntity;
import com.ssii.foomap.service.IMapService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Controller
public class MapApiController implements MapApi {
    @Autowired
    IMapService mapService;

    private static final Logger log = LoggerFactory.getLogger(MapApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MapApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<MapEntity> getMapConfigs(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration) {
        return ResponseEntity.ok(mapService.getMapConfigs());
    }

    public ResponseEntity<MapEntity> setMapConfigs(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody MapEntity options) {
        return ResponseEntity.ok(mapService.setMapConfigs(options));
    }

}
