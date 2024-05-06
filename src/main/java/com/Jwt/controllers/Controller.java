package com.Jwt.controllers;

import com.Jwt.Services.UserService;
import com.Jwt.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/home")
public class Controller {

    @Autowired
    private UserService userService;

    //http://localhost:8081/home/users
    @GetMapping("/users")
    public List<user> getUser(){

        System.out.println("getting current users");
        return userService.getUsers();

    }
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){

        return principal.getName();


    }

}
