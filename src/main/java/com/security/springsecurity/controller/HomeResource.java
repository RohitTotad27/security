package com.security.springsecurity.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {


    @RequestMapping("/home")
    public String message(){
        return ("<h1>WELCOME</h1>\n"+
        "<h2>to my application</h2>");
    }
}
