package com.example.sachin.demosachin.entities;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Users {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private List<String> userScopes;
}
