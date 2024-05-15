package com.nazmul_anik.securitytest1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        return "Hello Security "+request.getSession().getId();
    }

    @GetMapping("/about")
    public String about(){
        return "Welcome to about page";
    }
}
