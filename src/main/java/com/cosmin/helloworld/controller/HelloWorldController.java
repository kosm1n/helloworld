package com.cosmin.helloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping(value = "/helloworld")
    public ResponseEntity<String> helloworld() {
        return ResponseEntity.ok("Hello World...now let's start");
    }

}
