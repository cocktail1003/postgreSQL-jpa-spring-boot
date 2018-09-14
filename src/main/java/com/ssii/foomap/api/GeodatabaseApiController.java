package com.ssii.foomap.api;

import java.math.BigDecimal;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Controller
public class GeodatabaseApiController implements GeodatabaseApi {

    private static final Logger log = LoggerFactory.getLogger(GeodatabaseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GeodatabaseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> getGeoData(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "图层数据源名称，对就数据库表名称",required=true) @PathVariable("name") String name,@ApiParam(value = "查询关键字") @Valid @RequestParam(value = "keywords", required = false) String keywords,@ApiParam(value = "点查询的坐标点") @Valid @RequestParam(value = "point", required = false) List<BigDecimal> point,@ApiParam(value = "地图显示范围") @Valid @RequestParam(value = "bounds", required = false) List<BigDecimal> bounds,@ApiParam(value = "框选查询的框") @Valid @RequestParam(value = "box", required = false) List<BigDecimal> box,@ApiParam(value = "自定义查询，通过自定义sql where=后面的字符来进行查询") @Valid @RequestParam(value = "where", required = false) String where) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

}
