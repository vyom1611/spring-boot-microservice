package com.example.userapi.controllers;

import com.example.userapi.models.UserModel;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Environment environment;

    @GetMapping("/status")
    public String status() {
        return "Working on port: " + environment.getProperty("local.server.port");
    }

    @PostMapping("/create")
    public String createUser(@Valid @RequestBody UserModel userDetails) {
        UserModel user = new UserModel();

    }
}
