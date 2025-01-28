package com.example.demo_r2dbc.controller;

import com.example.demo_r2dbc.entity.User;
import com.example.demo_r2dbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public Mono<User> getUserByeEmail(@RequestParam String email) {
        return userService.getUserByEmail(email);
    }

}
