package com.example.sachin.demosachin.repo;

import com.example.sachin.demosachin.entities.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepo extends MongoRepository<Users,String> {
}
