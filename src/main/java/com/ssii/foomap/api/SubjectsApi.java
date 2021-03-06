/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.ssii.foomap.api;

import com.ssii.foomap.entity.SubjectEntity;
import com.ssii.foomap.entity.SubjectLayerEntity;
import com.ssii.foomap.model.Subject;
import com.ssii.foomap.model.SubjectLayerIndex;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Api(value = "subjects", description = "the subjects API")
public interface SubjectsApi {

    @ApiOperation(value = "创建新的专题", nickname = "addSubject", notes = "", response = Subject.class, tags = {"地图专题",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Subject.class)})
    @RequestMapping(value = "/subjects",
            method = RequestMethod.POST)
    ResponseEntity<SubjectEntity> addSubject(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                             @ApiParam(value = "专题信息，不包括图层", required = true) @Valid @RequestBody SubjectEntity subject);


    @ApiOperation(value = "给专题添加图层", nickname = "addSubjectLayer", notes = "", response = Boolean.class, tags = {"地图专题",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Boolean.class)})
    @RequestMapping(value = "/subjects/{id}/layers",
            method = RequestMethod.POST)
    ResponseEntity<Boolean> addSubjectLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                            @ApiParam(value = "专题编号", required = true) @PathVariable("id") Integer id,
                                            @ApiParam(value = "") @Valid @RequestBody SubjectLayerEntity subjectLayer);


    @ApiOperation(value = "删除一个专题", nickname = "deleteSubject", notes = "", tags = {"地图专题",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK")})
    @RequestMapping(value = "/subjects/{id}",
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSubject(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                       @ApiParam(value = "专题编号", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "删除专题中的某个图层", nickname = "deleteSubjectLayer", notes = "", response = Boolean.class, tags = {"地图专题",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Boolean.class)})
    @RequestMapping(value = "/subjects/{id}/layers/{layerId}",
            method = RequestMethod.DELETE)
    ResponseEntity<Boolean> deleteSubjectLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                               @ApiParam(value = "专题编号", required = true) @PathVariable("id") Integer id,
                                               @ApiParam(value = "图层编号", required = true) @PathVariable("layerId") Integer layerId,
                                               @ApiParam(value = "图层类型",required = true) String layerType);


    @ApiOperation(value = "获取指定专题的图层概要信息", nickname = "getSubjectLayers", notes = "", response = SubjectLayerIndex.class, responseContainer = "List", tags = {"地图专题",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = SubjectLayerIndex.class, responseContainer = "List")})
    @RequestMapping(value = "/subjects/{id}/layers",
            method = RequestMethod.GET)
    ResponseEntity<List<SubjectLayerIndex>> getSubjectLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                                             @ApiParam(value = "专题编号", required = true) @PathVariable("id") String id);


    @ApiOperation(value = "", nickname = "getSubjects", notes = "获取所有专题", response = Subject.class, responseContainer = "List", tags = {"地图专题",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK，返回所有的专题数据", response = Subject.class, responseContainer = "List")})
    @RequestMapping(value = "/subjects",
            method = RequestMethod.GET)
    ResponseEntity<List<Subject>> getSubjects(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration);


    @ApiOperation(value = "修改专题信息", nickname = "updateSubject", notes = "", response = Subject.class, tags = {"地图专题",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Subject.class)})
    @RequestMapping(value = "/subjects",
            method = RequestMethod.PUT)
    ResponseEntity<Subject> updateSubject(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                          @ApiParam(value = "专题信息，不包括图层", required = true) @Valid @RequestBody Subject subject);


    @ApiOperation(value = "修改专题图层，主要是调整专题图层的顺序", nickname = "updateSubjectLayer", notes = "", response = Boolean.class, tags = {"地图专题",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Boolean.class)})
    @RequestMapping(value = "/subjects/{id}/layers",
            method = RequestMethod.PUT)
    ResponseEntity<Boolean> updateSubjectLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "专题编号", required = true) @PathVariable("id") String id, @ApiParam(value = "") @Valid @RequestBody SubjectLayerIndex layer);

}
