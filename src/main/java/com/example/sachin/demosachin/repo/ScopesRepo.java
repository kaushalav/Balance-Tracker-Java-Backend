package com.example.sachin.demosachin.repo;
import com.example.sachin.demosachin.entities.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScopesRepo extends MongoRepository<Scopes,String> {
}
