package com.ssii.foomap.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssii.foomap.auth.model.Authentication;
import com.ssii.foomap.auth.model.AuthenticationResponse;
import com.ssii.foomap.auth.service.AuthService;
import com.ssii.foomap.common.core.GraceException;
import com.ssii.foomap.model.Auth;
import com.ssii.foomap.user.entity.User;
import com.ssii.foomap.user.service.IUserService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-11T08:16:31.504Z")

@Controller
public class UsersApiController implements UsersApi {

    @Value("${jwt.header}")
    private String tokenHeader;
    @Autowired
    IUserService userService;
    @Autowired
    private AuthService authService;

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity login(@RequestBody Authentication authentication , HttpServletRequest request) {
        try {
            String token = authService.login(authentication.getName(), authentication.getPassword(), request);
            return ResponseEntity.ok(new AuthenticationResponse(token));
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
    }

    public ResponseEntity<Void> logout(@ApiParam(value = "登录成功后的token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration) {
        authService.logout(authoration);
        return ResponseEntity.ok(null);
    }

    public ResponseEntity refreshToken(@ApiParam(value = "用户登录成功后的token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration) {
        String refreshedToken = authService.refresh(authoration);
        if (refreshedToken == null) {
            throw new GraceException(400, "刷新Token失败");
        } else {
            return ResponseEntity.ok(new AuthenticationResponse(refreshedToken));
        }
    }

    public ResponseEntity<User> registUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        return ResponseEntity.ok(userService.register(user));
    }

    public ResponseEntity<Void> resetPassword(@ApiParam(value = "用户登录成功后的token" ,required=true) @RequestHeader(value="authoration", required=true) String authoration,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auth user) {
        userService.restPassword(user);
        authService.logout(authoration);
        return ResponseEntity.ok(null);
    }

}
