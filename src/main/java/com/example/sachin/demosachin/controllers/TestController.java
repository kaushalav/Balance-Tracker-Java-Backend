package com.example.sachin.demosachin.controllers;

import com.example.sachin.demosachin.models.requests.CreateUserReq;
import com.example.sachin.demosachin.models.response.ApiResponse;
import com.example.sachin.demosachin.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api1/")
public class TestController {
    private final UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUserId() {
        return userService.createUser();
    }

    @PostMapping
    public ResponseEntity<ApiResponse> createUserByPostMan(@RequestBody CreateUserReq createUserReq) {
        return new ResponseEntity<>(userService.createUser(createUserReq), HttpStatus.OK);
    }
}
