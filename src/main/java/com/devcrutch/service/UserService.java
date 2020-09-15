package com.devcrutch.service;


import com.devcrutch.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // we can omit this part
    public User loadUserByUsername(String name) {
        User u = new User();
        u.setId(1l);
        u.setUsername("v.hashemi");
        return u;
    }
}
