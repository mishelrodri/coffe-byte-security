package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

    @GetMapping()
    public String hello(){
        return "<h1>\uD83D\uDE4C AUTHENTICATED</h1>";
    }
}
