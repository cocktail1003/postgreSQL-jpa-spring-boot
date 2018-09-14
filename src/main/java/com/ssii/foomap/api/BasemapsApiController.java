package com.ssii.foomap.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssii.foomap.entity.BaseMapEntity;
import com.ssii.foomap.service.IBaseMapService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Controller
public class BasemapsApiController implements BasemapsApi {
    @Autowired
    IBaseMapService baseMapService;

    private static final Logger log = LoggerFactory.getLogger(BasemapsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BasemapsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BaseMapEntity> addBasemapLayer(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,
                                                         @ApiParam(value = "图层基础信息" ,required=true )  @Valid @RequestBody BaseMapEntity layer) {
        return ResponseEntity.ok(baseMapService.addBasemapLayer(layer));
    }

    public ResponseEntity<Boolean> delBasemapLayer(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "图层编号",required=true) @PathVariable("id") Integer id) {
        return ResponseEntity.ok(baseMapService.delBasemapLayer(id));
    }

    public ResponseEntity<List<BaseMapEntity>> getBasemaps(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration) {
        return ResponseEntity.ok(baseMapService.getBasemaps());
    }

    public ResponseEntity<BaseMapEntity> updateBasemapLayer(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,
                                                            @ApiParam(value = "图层基础信息" ,required=true )  @Valid @RequestBody BaseMapEntity layer) {
        return ResponseEntity.ok(baseMapService.updateBasemapLayer(layer));
    }

}
