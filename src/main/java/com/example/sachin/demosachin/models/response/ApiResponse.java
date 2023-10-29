package com.example.sachin.demosachin.models.response;

import lombok.Data;

@Data
public class ApiResponse {
    private boolean success = false;
    private int errorCode;
    private String errorMessage;
    private Object data;
}
