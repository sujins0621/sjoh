package com.framework.config.security;

import org.springframework.security.authentication.AuthenticationManager;

public class JwtAuthorizationFilter {
    public JwtAuthorizationFilter(AuthenticationManager authenticationManagerBean, UserRepository userRepository) {
    }
}
