package com.example.demo_r2dbc.service;

import com.example.demo_r2dbc.entity.User;
import com.example.demo_r2dbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Mono<User> getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
