package com.manoharvallabi.springsecurityoauth2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String login()
    {
        return "Welcome to HomePage";
    }

}
