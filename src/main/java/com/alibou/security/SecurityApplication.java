package com.alibou.security;

import com.alibou.security.auth.AuthenticationService;
import com.alibou.security.auth.RegisterRequest;
import com.alibou.security.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.alibou.security.user.Role.ADMIN;
import static com.alibou.security.user.Role.MANAGER;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.id(1)
					.firstname("Admin")
					.lastname("Admin")
					.email("Admin") 
					.password("123")
					.lang("ar")
					.role(ADMIN)
					.userName("Admin")
					.build();
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

			var manager = RegisterRequest.builder()
					.id(2) 
					.firstname("Admin1")
					.lastname("Admin1")
					.lang("en")
					.userName("Admin1") 
					.email("Admin1")
					.password("123")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + service.register(manager).getAccessToken());
		};
	}
}
