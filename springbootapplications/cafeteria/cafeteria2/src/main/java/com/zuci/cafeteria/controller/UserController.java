package com.zuci.cafeteria.controller;

import com.zuci.cafeteria.model.Login;
import com.zuci.cafeteria.model.Users;
import com.zuci.cafeteria.service.CustomUserDetailsService;
import com.zuci.cafeteria.service.JwtUtilityService;
import com.zuci.cafeteria.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private JwtUtilityService jwtUtilityService;
    @Autowired
    private UserService userService;
    @PostMapping("/users")
    public Users createUser(@RequestBody Users users){
        return userService.createUser(users);

    }
    @PostMapping("/login")
    public String createUser(@RequestBody Login login){
            if(customUserDetailsService.loadUserByUsername(login.getUsername())==null){
                    return "Invalid credentials";
            }
        return  jwtUtilityService.generateToken(login.getUsername());

    }
}
