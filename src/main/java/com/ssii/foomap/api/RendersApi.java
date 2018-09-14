/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.ssii.foomap.api;

import com.ssii.foomap.model.SimpleIconRender;
import com.ssii.foomap.model.SimplePathRender;
import com.ssii.foomap.model.UniqueIconRender;
import com.ssii.foomap.model.UniquePathRender;
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

@Api(value = "renders", description = "the renders API")
public interface RendersApi {

    @ApiOperation(value = "添加渲染器", nickname = "addSimpleIconRender", notes = "", response = SimpleIconRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SimpleIconRender.class) })
    @RequestMapping(value = "/renders/simpleicon",
        method = RequestMethod.POST)
    ResponseEntity<SimpleIconRender> addSimpleIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SimpleIconRender render);


    @ApiOperation(value = "添加渲染器", nickname = "addSimplePathRender", notes = "", response = SimplePathRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SimplePathRender.class) })
    @RequestMapping(value = "/renders/simplepath",
        method = RequestMethod.POST)
    ResponseEntity<SimplePathRender> addSimplePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SimplePathRender render);


    @ApiOperation(value = "添加渲染器", nickname = "addUniqueIconRender", notes = "", response = UniqueIconRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniqueIconRender.class) })
    @RequestMapping(value = "/renders/uniqueicon",
        method = RequestMethod.POST)
    ResponseEntity<UniqueIconRender> addUniqueIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UniqueIconRender render);


    @ApiOperation(value = "添加渲染器", nickname = "addUniquePathRender", notes = "", response = UniquePathRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniquePathRender.class) })
    @RequestMapping(value = "/renders/uniquepath",
        method = RequestMethod.POST)
    ResponseEntity<UniquePathRender> addUniquePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UniquePathRender render);


    @ApiOperation(value = "获取渲染详情", nickname = "deleteSimpleIconRender", notes = "", response = Boolean.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Boolean.class) })
    @RequestMapping(value = "/renders/simpleicon/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Boolean> deleteSimpleIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "删除渲染", nickname = "deleteSimplePathRender", notes = "", response = Boolean.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Boolean.class) })
    @RequestMapping(value = "/renders/simplepath/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Boolean> deleteSimplePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "删除渲染", nickname = "deleteUniqueIconRender", notes = "", response = Boolean.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Boolean.class) })
    @RequestMapping(value = "/renders/uniqueicon/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Boolean> deleteUniqueIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "删除渲染详情", nickname = "deleteUniquePathRender", notes = "", response = UniquePathRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniquePathRender.class) })
    @RequestMapping(value = "/renders/uniquepath/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<UniquePathRender> deleteUniquePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "获取渲染详情", nickname = "getSimpleIconRender", notes = "", response = SimpleIconRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SimpleIconRender.class) })
    @RequestMapping(value = "/renders/simpleicon/{id}",
        method = RequestMethod.GET)
    ResponseEntity<SimpleIconRender> getSimpleIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "获取简单Icon渲染数据", nickname = "getSimpleIconRenders", notes = "", response = SimpleIconRender.class, responseContainer = "List", tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SimpleIconRender.class, responseContainer = "List") })
    @RequestMapping(value = "/renders/simpleicon",
        method = RequestMethod.GET)
    ResponseEntity<List<SimpleIconRender>> getSimpleIconRenders(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration);


    @ApiOperation(value = "获取渲染详情", nickname = "getSimplePathRender", notes = "", response = SimplePathRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SimplePathRender.class) })
    @RequestMapping(value = "/renders/simplepath/{id}",
        method = RequestMethod.GET)
    ResponseEntity<SimplePathRender> getSimplePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "获取简单Icon渲染数据", nickname = "getSimplePathRenders", notes = "", response = SimplePathRender.class, responseContainer = "List", tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SimplePathRender.class, responseContainer = "List") })
    @RequestMapping(value = "/renders/simplepath",
        method = RequestMethod.GET)
    ResponseEntity<List<SimplePathRender>> getSimplePathRenders(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration);


    @ApiOperation(value = "获取渲染详情", nickname = "getUniqueIconRender", notes = "", response = UniqueIconRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniqueIconRender.class) })
    @RequestMapping(value = "/renders/uniqueicon/{id}",
        method = RequestMethod.GET)
    ResponseEntity<UniqueIconRender> getUniqueIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "获取简单Icon渲染数据", nickname = "getUniqueIconRenders", notes = "", response = UniqueIconRender.class, responseContainer = "List", tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniqueIconRender.class, responseContainer = "List") })
    @RequestMapping(value = "/renders/uniqueicon",
        method = RequestMethod.GET)
    ResponseEntity<List<UniqueIconRender>> getUniqueIconRenders(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration);


    @ApiOperation(value = "获取渲染详情", nickname = "getUniquePathRender", notes = "", response = UniquePathRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniquePathRender.class) })
    @RequestMapping(value = "/renders/uniquepath/{id}",
        method = RequestMethod.GET)
    ResponseEntity<UniquePathRender> getUniquePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "获取唯一值渲染数据", nickname = "getUniquePathRenders", notes = "", response = UniquePathRender.class, responseContainer = "List", tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniquePathRender.class, responseContainer = "List") })
    @RequestMapping(value = "/renders/uniquepath",
        method = RequestMethod.GET)
    ResponseEntity<List<UniquePathRender>> getUniquePathRenders(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration);


    @ApiOperation(value = "修改渲染器", nickname = "updateSimpleIconRender", notes = "", response = SimpleIconRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SimpleIconRender.class) })
    @RequestMapping(value = "/renders/simpleicon",
        method = RequestMethod.PUT)
    ResponseEntity<SimpleIconRender> updateSimpleIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SimpleIconRender render);


    @ApiOperation(value = "修改渲染器", nickname = "updateSimplePathRender", notes = "", response = SimplePathRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SimplePathRender.class) })
    @RequestMapping(value = "/renders/simplepath",
        method = RequestMethod.PUT)
    ResponseEntity<SimplePathRender> updateSimplePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody SimplePathRender render);


    @ApiOperation(value = "修改渲染器", nickname = "updateUniqueIconRender", notes = "", response = UniqueIconRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniqueIconRender.class) })
    @RequestMapping(value = "/renders/uniqueicon",
        method = RequestMethod.PUT)
    ResponseEntity<UniqueIconRender> updateUniqueIconRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UniqueIconRender render);


    @ApiOperation(value = "修改渲染器", nickname = "updateUniquePathRender", notes = "", response = UniquePathRender.class, tags={ "图层渲染器", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UniquePathRender.class) })
    @RequestMapping(value = "/renders/uniquepath",
        method = RequestMethod.PUT)
    ResponseEntity<UniquePathRender> updateUniquePathRender(@ApiParam(value = "用户登录成功后的Token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UniquePathRender render);

}