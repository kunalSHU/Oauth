package com.example.simpleOAuth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/access")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("My resource has been accessed through Okta access token");
    }
}