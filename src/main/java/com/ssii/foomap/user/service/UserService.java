package com.ssii.foomap.user.service;

import com.ssii.foomap.common.core.GraceException;
import com.ssii.foomap.model.Auth;
import com.ssii.foomap.user.entity.User;
import com.ssii.foomap.user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Name:UserService
 * Description:
 * Author:leix
 * Time: 2017/6/12 10:29
 */
@Service
@Transactional
public class UserService implements IUserService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public User register(User user) {
        final String username = user.getName();
        if (userRepository.findByName(username) != null) {
            return null;
        }

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        final String rawPassword = user.getPassword();
        user.setPassword(encoder.encode(rawPassword));
        user.setLastPasswordResetDate(new Date());
        user.setRoles("ROLE_USER");
        return userRepository.save(user);
    }

    @Override
    public User restPassword(Auth auth) {
        final String username = auth.getName();
        User user = userRepository.findByName(username);
        if (user == null) {
            throw new GraceException(422, "该用户不存在！");
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        final String rawPassword = auth.getPassword();
        user.setPassword(encoder.encode(rawPassword));
        user.setLastPasswordResetDate(new Date());
        return userRepository.save(user);
    }
}
