package com.example.sachin.demosachin;

import com.example.sachin.demosachin.entities.Users;
import com.example.sachin.demosachin.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoAuditing
public class DemoSachinApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSachinApplication.class, args);
	}

}
