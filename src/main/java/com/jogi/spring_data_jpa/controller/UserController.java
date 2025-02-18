package com.jogi.spring_data_jpa.controller;

import com.jogi.spring_data_jpa.entity.UserDetails;
import com.jogi.spring_data_jpa.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping(path = "/test-jpa")
    public UserDetails getUser(){
        UserDetails userDetails1 =
                new UserDetails("xyz", "xyz@gmail.com");

        userDetailsService.saveUser(userDetails1);
        return userDetailsService.findById(1L);
    }
}
