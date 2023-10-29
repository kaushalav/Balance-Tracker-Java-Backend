package com.example.sachin.demosachin.services;

import com.example.sachin.demosachin.entities.Users;
import com.example.sachin.demosachin.models.requests.CreateUserReq;
import com.example.sachin.demosachin.models.response.ApiResponse;

public interface UserService {
    String createUser();
    ApiResponse createUser(CreateUserReq createUserReq);
}
