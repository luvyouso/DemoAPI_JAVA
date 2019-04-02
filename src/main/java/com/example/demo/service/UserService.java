package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.Account;

@Service
public interface UserService {
    Account login(String username,String password);

    boolean existsByUsername(String username);
}