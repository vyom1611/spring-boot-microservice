package com.example.userapi.controllers;

import com.example.userapi.data.UserEntity;
import com.example.userapi.models.CreateUserResponseModel;
import com.example.userapi.services.UserService;
import com.example.userapi.shared.UserDataTransferObject;
import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Environment environment;

    @Autowired
    UserService userService;

    @GetMapping("/status")
    public String status() {
        return "Working on port: " + environment.getProperty("local.server.port");
    }

    @PostMapping("/create")
    public ResponseEntity<CreateUserResponseModel> createUser(@Valid @RequestBody UserEntity userDetails) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDataTransferObject userDTO = modelMapper.map(userDetails, UserDataTransferObject.class);
        UserDataTransferObject createdUser = userService.createUser(userDTO);

        CreateUserResponseModel result = modelMapper.map(createdUser, CreateUserResponseModel.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
