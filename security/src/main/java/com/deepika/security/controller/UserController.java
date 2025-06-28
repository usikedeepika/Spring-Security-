package com.deepika.security.controller;

import com.deepika.security.model.Users;
import com.deepika.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{


    @Autowired
    UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users users){
        return userService.register(users);

    }


    @PostMapping("/login")
    public String login(@RequestBody Users user) {

        return userService.verify(user);
    }

}
