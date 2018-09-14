/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.ssii.foomap.api;

import com.ssii.foomap.entity.GeoJsonLayerEntity;
import com.ssii.foomap.model.JsonLayer;
import com.ssii.foomap.model.LayerSet;
import com.ssii.foomap.model.TileLayer;
import com.ssii.foomap.model.WMSLayer;
import com.ssii.foomap.model.WMTSLayer;
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

@Api(value = "layers", description = "the layers API")
public interface LayersApi {

    @ApiOperation(value = "添加一个图层", nickname = "addGeoJSONLayer", notes = "", response = JsonLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = JsonLayer.class)})
    @RequestMapping(value = "/layers/geojson",
            method = RequestMethod.POST)
    ResponseEntity<JsonLayer> addGeoJSONLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody JsonLayer layer);


    @ApiOperation(value = "添加一个TMS图层", nickname = "addTMSLayer", notes = "", response = TileLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = TileLayer.class)})
    @RequestMapping(value = "/layers/tms",
            method = RequestMethod.POST)
    ResponseEntity<TileLayer> addTMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody TileLayer layer);


    @ApiOperation(value = "添加一个图层", nickname = "addWMSLayer", notes = "", response = WMSLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = WMSLayer.class)})
    @RequestMapping(value = "/layers/wms",
            method = RequestMethod.POST)
    ResponseEntity<WMSLayer> addWMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody WMSLayer layer);


    @ApiOperation(value = "添加一个图层", nickname = "addWMTSLayer", notes = "", response = WMTSLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = WMTSLayer.class)})
    @RequestMapping(value = "/layers/wmts",
            method = RequestMethod.POST)
    ResponseEntity<WMTSLayer> addWMTSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody WMTSLayer layer);


    @ApiOperation(value = "删除指定图层", nickname = "deleteGeoJSONLayer", notes = "", response = Boolean.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Boolean.class)})
    @RequestMapping(value = "/layers/geojson/{id}",
            method = RequestMethod.DELETE)
    ResponseEntity<Boolean> deleteGeoJSONLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "删除指定图层", nickname = "deleteTMSLayer", notes = "", response = Boolean.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Boolean.class)})
    @RequestMapping(value = "/layers/tms/{id}",
            method = RequestMethod.DELETE)
    ResponseEntity<Boolean> deleteTMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "删除指定图层", nickname = "deleteWMSLayer", notes = "", response = Boolean.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Boolean.class)})
    @RequestMapping(value = "/layers/wms/{id}",
            method = RequestMethod.DELETE)
    ResponseEntity<Boolean> deleteWMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "删除指定图层", nickname = "deleteWMTSLayer", notes = "", response = Boolean.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Boolean.class)})
    @RequestMapping(value = "/layers/wmts/{id}",
            method = RequestMethod.DELETE)
    ResponseEntity<Boolean> deleteWMTSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "获取图层详细信息", nickname = "getGeoJSONLayer", notes = "", response = JsonLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = JsonLayer.class)})
    @RequestMapping(value = "/layers/geojson/{id}",
            method = RequestMethod.GET)
    ResponseEntity<GeoJsonLayerEntity> getGeoJSONLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration,
                                                       @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "获取所有图层", nickname = "getGeoJSONLayers", notes = "", response = JsonLayer.class, responseContainer = "List", tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = JsonLayer.class, responseContainer = "List")})
    @RequestMapping(value = "/layers/geojson",
            method = RequestMethod.GET)
    ResponseEntity<List<JsonLayer>> getGeoJSONLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration);


    @ApiOperation(value = "返回所有图层概要信息", nickname = "getLayers", notes = "", response = LayerSet.class, responseContainer = "List", tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = LayerSet.class, responseContainer = "List")})
    @RequestMapping(value = "/layers",
            method = RequestMethod.GET)
    ResponseEntity<LayerSet> getLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration);


    @ApiOperation(value = "获取图层详细信息", nickname = "getTMSLayer", notes = "", response = TileLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = TileLayer.class)})
    @RequestMapping(value = "/layers/tms/{id}",
            method = RequestMethod.GET)
    ResponseEntity<TileLayer> getTMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "获取所有tms图层", nickname = "getTMSLayers", notes = "", response = TileLayer.class, responseContainer = "List", tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = TileLayer.class, responseContainer = "List")})
    @RequestMapping(value = "/layers/tms",
            method = RequestMethod.GET)
    ResponseEntity<List<TileLayer>> getTMSLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration);


    @ApiOperation(value = "获取图层详细信息", nickname = "getWMSLayer", notes = "", response = WMSLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = WMSLayer.class)})
    @RequestMapping(value = "/layers/wms/{id}",
            method = RequestMethod.GET)
    ResponseEntity<WMSLayer> getWMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "获取所有图层", nickname = "getWMSLayers", notes = "", response = WMSLayer.class, responseContainer = "List", tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = WMSLayer.class, responseContainer = "List")})
    @RequestMapping(value = "/layers/wms",
            method = RequestMethod.GET)
    ResponseEntity<List<WMSLayer>> getWMSLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration);


    @ApiOperation(value = "获取图层详细信息", nickname = "getWMTSLayer", notes = "", response = WMTSLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = WMTSLayer.class)})
    @RequestMapping(value = "/layers/wmts/{id}",
            method = RequestMethod.GET)
    ResponseEntity<WMTSLayer> getWMTSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "图层编号", required = true) @PathVariable("id") Integer id);


    @ApiOperation(value = "获取所有图层", nickname = "getWMTSLayers", notes = "", response = WMTSLayer.class, responseContainer = "List", tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = WMTSLayer.class, responseContainer = "List")})
    @RequestMapping(value = "/layers/wmts",
            method = RequestMethod.GET)
    ResponseEntity<List<WMTSLayer>> getWMTSLayers(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration);


    @ApiOperation(value = "修改一个图层的信息", nickname = "updateGeoJSONLayer", notes = "", response = JsonLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = JsonLayer.class)})
    @RequestMapping(value = "/layers/geojson",
            method = RequestMethod.PUT)
    ResponseEntity<JsonLayer> updateGeoJSONLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody JsonLayer layer);


    @ApiOperation(value = "修改一个TMS图层的信息", nickname = "updateTMSLayer", notes = "", response = TileLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = TileLayer.class)})
    @RequestMapping(value = "/layers/tms",
            method = RequestMethod.PUT)
    ResponseEntity<TileLayer> updateTMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody TileLayer layer);


    @ApiOperation(value = "修改一个图层的信息", nickname = "updateWMSLayer", notes = "", response = WMSLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = WMSLayer.class)})
    @RequestMapping(value = "/layers/wms",
            method = RequestMethod.PUT)
    ResponseEntity<WMSLayer> updateWMSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody WMSLayer layer);


    @ApiOperation(value = "修改一个图层的信息", nickname = "updateWMTSLayer", notes = "", response = WMTSLayer.class, tags = {"图层配制",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = WMTSLayer.class)})
    @RequestMapping(value = "/layers/wmts",
            method = RequestMethod.PUT)
    ResponseEntity<WMTSLayer> updateWMTSLayer(@ApiParam(value = "用户登录成功后的Token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "") @Valid @RequestBody WMTSLayer layer);

}
