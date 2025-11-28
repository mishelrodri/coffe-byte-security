package com.coffe.controller;

import com.coffe.dto.Mensaje;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class ControllerExample {


    @GetMapping("/list")
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok(new Mensaje("Hola Mundo"));
    }

    @PostMapping("/create")
    public ResponseEntity<?> postHello(){
        return ResponseEntity.ok(new Mensaje("Hola POST"));
    }

    @GetMapping("/authorized")
    public ResponseEntity<?> authrized(@RequestParam String code){
        return ResponseEntity.ok(Collections.singletonMap("code", code));
    }


}
