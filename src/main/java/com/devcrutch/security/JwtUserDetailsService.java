package com.devcrutch.security;

import com.devcrutch.entity.User;

public class JwtUserDetailsService {
    public User loadUserByUsername(String username) {
        User u = new User();
        u.setUsername(username);
        u.setId(1l);
        return u;
    }
}
