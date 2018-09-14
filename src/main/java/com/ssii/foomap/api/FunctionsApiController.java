package com.ssii.foomap.api;

import java.math.BigDecimal;
import com.ssii.foomap.model.NameValuePair;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Controller
public class FunctionsApiController implements FunctionsApi {

    private static final Logger log = LoggerFactory.getLogger(FunctionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FunctionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<NameValuePair>> containQuery(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "查询目标，在哪些图层里进行查询" ) @RequestHeader(value="layers", required=false) List<String> layers,@ApiParam(value = "是否严格模式，严格模式下只查询包含在内的数据，非严格模式相交的数据也作为查询结果") @Valid @RequestParam(value = "strict", required = false) Boolean strict,@ApiParam(value = "查询的框图形，多边形") @Valid @RequestParam(value = "box", required = false) List<BigDecimal> box) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<NameValuePair>>(objectMapper.readValue("[ {  \"name\" : \"name\",  \"value\" : \"value\"}, {  \"name\" : \"name\",  \"value\" : \"value\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<NameValuePair>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<NameValuePair>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<NameValuePair>> identify(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "查询目标，在哪些图层里进行查询" ) @RequestHeader(value="layers", required=false) List<String> layers,@ApiParam(value = "点查询的坐标点") @Valid @RequestParam(value = "point", required = false) List<BigDecimal> point,@ApiParam(value = "点查询的缓冲范围") @Valid @RequestParam(value = "redius", required = false) BigDecimal redius,@ApiParam(value = "地图显示范围") @Valid @RequestParam(value = "bounds", required = false) List<BigDecimal> bounds) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<NameValuePair>>(objectMapper.readValue("[ {  \"name\" : \"name\",  \"value\" : \"value\"}, {  \"name\" : \"name\",  \"value\" : \"value\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<NameValuePair>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<NameValuePair>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<NameValuePair>> search(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "查询目标，在哪些图层里进行查询" ) @RequestHeader(value="layers", required=false) List<String> layers,@ApiParam(value = "全文查询的关键词") @Valid @RequestParam(value = "keywords", required = false) String keywords,@ApiParam(value = "自定义查询，通过自定义sql where=后面的字符来进行查询") @Valid @RequestParam(value = "where", required = false) String where,@ApiParam(value = "地图显示范围") @Valid @RequestParam(value = "bounds", required = false) List<BigDecimal> bounds) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<NameValuePair>>(objectMapper.readValue("[ {  \"name\" : \"name\",  \"value\" : \"value\"}, {  \"name\" : \"name\",  \"value\" : \"value\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<NameValuePair>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<NameValuePair>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
