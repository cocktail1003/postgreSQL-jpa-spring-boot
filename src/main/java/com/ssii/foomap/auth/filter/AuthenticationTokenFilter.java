package com.ssii.foomap.auth.filter;

import com.ssii.foomap.auth.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationTokenFilter extends OncePerRequestFilter {


    @Autowired
    private TokenUtil jwtTokenUtil;

    @Value("${jwt.header}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        String authHeader = request.getHeader(this.tokenHeader);

        logger.info("process request, url: " + request.getRequestURL().toString() + " method: " + request.getMethod());

        if (authHeader != null && authHeader.startsWith(tokenHead)) {
            final String authToken = authHeader.substring(tokenHead.length()); // The part after "Bearer "
            String username = jwtTokenUtil.getUsernameFromToken(authToken);

            logger.info("checking authentication " + username);

            if (username != null) {
                // 如果我们足够相信token中的数据，也就是我们足够相信签名token的secret的机制足够好
                // 这种情况下，我们可以不用再查询数据库，而直接采用token中的数据
                // 本例中，我们还是通过Spring Security的 @UserDetailsService 进行了数据查询
                // 但简单验证的话，你可以采用直接验证token是否合法来避免昂贵的数据查询

                // token合法，但是缓存中该用户的token已经更新，故拒绝api请求
//                if (!redisBasedSessionUtil.getTokenInSession(username).equals(authToken)) {
//                    response.sendError(403, "登录信息已过期，请重新登录！");
//                    logger.info("token of " + username + " is expired");
//                    return;
//                }

//                AuthUser userDetails = redisBasedSessionUtil.getAuthUser(username);
//                if (userDetails != null && jwtTokenUtil.validateToken(authToken, userDetails)) {
//                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                    SecurityContextHolder.getContext().setAuthentication(authentication);

                    logger.info("authenticated user " + username + ", setting security context");

            }
        }

        chain.doFilter(request, response);
    }
}
