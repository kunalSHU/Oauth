package com.example.simpleoauth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/access")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("My resource has been accessed through Okta access token");
    }

    @GetMapping("/messsage")
    public String getMessage() {
        return message;
    }
}