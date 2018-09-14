package com.ssii.foomap.auth.service;

import com.ssii.foomap.auth.model.AuthUser;
import com.ssii.foomap.auth.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Name:AuthService
 * Description:用户认证业务实现类
 * Author:leix
 * Time: 2017/6/12 09:43
 */
@Service
public class AuthService implements IAuthService {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private TokenUtil jwtTokenUtil;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public String login(String name, String password, HttpServletRequest request) {
        UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(name, password);
        Authentication authentication = authenticationManager.authenticate(upToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        UserDetailsServiceImpl imp = (UserDetailsServiceImpl) userDetailsService;
        AuthUser userDetails = (AuthUser) imp.loadUserByUsername(name);
        String token = jwtTokenUtil.generateToken(userDetails);
        // redisBasedSessionUtil.addSessionObject(token, userDetails);
        return token;
    }

    @Override
    public void logout(String token) {
        final String authToken = token.substring(tokenHead.length()); // The part after "Bearer "
//        redisBasedSessionUtil.clearSession(jwtTokenUtil.getUsernameFromToken(authToken));
    }

    @Override
    public String refresh(String oldToken) {
        if (oldToken != null) {
            final String token = oldToken.substring(tokenHead.length());
            String retToken;
            AuthUser userDetails = (AuthUser) userDetailsService.loadUserByUsername(jwtTokenUtil.getUsernameFromToken(token));
            if (userDetails != null && jwtTokenUtil.canTokenBeRefreshed(token, userDetails.getLastPasswordResetDate())) {
                retToken = jwtTokenUtil.refreshToken(token);
//               redisBasedSessionUtil.addSessionObject(retToken, userDetails);
                return retToken;
            }
        }
        return null;
    }


}
