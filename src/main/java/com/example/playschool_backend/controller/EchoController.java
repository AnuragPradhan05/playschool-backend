package com.example.playschool_backend.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://playschoolap.netlify.app/") // or your Netlify URL
public class EchoController {

    @PostMapping("/echo")
    public String echo(@RequestBody Map<String, String> body) {
        String message = body.get("message");
        return "Backend received: " + message;
    }
}