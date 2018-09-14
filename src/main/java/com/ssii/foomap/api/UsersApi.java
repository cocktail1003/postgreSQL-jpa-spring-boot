/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.ssii.foomap.api;

import com.ssii.foomap.auth.model.Authentication;
import com.ssii.foomap.model.Auth;
import com.ssii.foomap.user.entity.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "登录认证", nickname = "login", notes = "", response = String.class, tags = {"用户",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK，登录成功后返回用户Token", response = String.class)})
    @RequestMapping(value = "/users/auth",method = RequestMethod.POST)
    ResponseEntity login(@RequestBody Authentication authentication , HttpServletRequest request);


    @ApiOperation(value = "退出登录", nickname = "logout", notes = "", tags = {"用户",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK，退出登录成功")})
    @RequestMapping(value = "/users/auth",method = RequestMethod.DELETE)
    ResponseEntity<Void> logout(@ApiParam(value = "登录成功后的token", required = true) @RequestHeader(value = "authoration", required = true) String authoration);


    @ApiOperation(value = "刷新用户Token", nickname = "refreshToken", notes = "", response = String.class, tags = {"用户",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK,返回新的Token", response = String.class)})
    @RequestMapping(value = "/users/auth",method = RequestMethod.PUT)
    ResponseEntity refreshToken(@ApiParam(value = "用户登录成功后的token", required = true) @RequestHeader(value = "authoration", required = true) String authoration);


    @ApiOperation(value = "注册新用户", nickname = "registUser", notes = "", tags = {"用户",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK")})
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    ResponseEntity<User> registUser(@ApiParam(value = "", required = true) @Valid @RequestBody User user);


    @ApiOperation(value = "密码重置", nickname = "resetPassword", notes = "", tags = {"用户",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK,重置成功，重新登录")})
    @RequestMapping(value = "/users/password",method = RequestMethod.PUT)
    ResponseEntity<Void> resetPassword(@ApiParam(value = "用户登录成功后的token", required = true) @RequestHeader(value = "authoration", required = true) String authoration, @ApiParam(value = "", required = true) @Valid @RequestBody Auth user);

}
