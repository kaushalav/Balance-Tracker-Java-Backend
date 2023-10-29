package com.example.sachin.demosachin.entities;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Scopes {
    @Id
    private String id;
    private List<String> userScopes;
}
