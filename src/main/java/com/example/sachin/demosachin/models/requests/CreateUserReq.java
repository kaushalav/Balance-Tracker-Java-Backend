package com.example.sachin.demosachin.models.requests;

import lombok.Data;

@Data
public class CreateUserReq {
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String email;

}
