package com.ssii.foomap.auth.service;

import javax.servlet.http.HttpServletRequest;

/**
 * Name:AuthServiceImpl
 * Description:用户认证业务接口
 * Author:leix
 * Time: 2017/6/12 09:43
 */
public interface IAuthService {
    String login(String name, String password, HttpServletRequest request);

    void logout(String token);

    String refresh(String oldToken);

}
