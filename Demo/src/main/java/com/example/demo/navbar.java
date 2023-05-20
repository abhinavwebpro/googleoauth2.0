package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class navbar {

    @GetMapping("/")
    public String showNavbar() {
        return "navbar";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}


    
