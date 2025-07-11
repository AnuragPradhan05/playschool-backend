package com.example.playschool_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://playschoolap.netlify.app/") // or your Netlify URL
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from PlaySchool Backend!";
    }
}
