package com.mshr;

import org.apache.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.mshr.model.User;
import com.mshr.repo.UserRepo;

@EnableDiscoveryClient
@SpringBootApplication
public class UserCrudServiceApplication {

	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(UserCrudServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner cmd() { // Cloud Native, Robust, Progressive ; web
								// application

		// RestTemplate rt;
		// HttpClient c;

		return args -> {
			userRepo.save(new User(1, "Rakib", "01688211511", "20"));
			userRepo.save(new User(2, "Mamun", "01684546278", "21"));
			userRepo.save(new User(3, "Nokib", "01677777478", "22"));
			userRepo.save(new User(4, "Akib", "645654654", "23"));
			userRepo.save(new User(5, "Nakib", "145645654421", "25"));
			userRepo.save(new User(6, "Sojib", "6546546585", "28"));
			userRepo.save(new User(7, "Riaz", "9855465668", "30"));

		};

	}

}
