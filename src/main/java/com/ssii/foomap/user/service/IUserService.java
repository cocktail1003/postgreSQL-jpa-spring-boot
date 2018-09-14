package com.ssii.foomap.user.service;


import com.ssii.foomap.model.Auth;
import com.ssii.foomap.user.entity.User;

/**
 * Name:IUserService
 * Description:
 * Author:leix
 * Time: 2017/6/12 10:29
 */
public interface IUserService {
    User register(User user);
    User restPassword(Auth auth);
}
