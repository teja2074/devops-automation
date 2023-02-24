package com.krishna.devopsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to CI/CD pipelines";
	}

	public static void main(String[] args) {

		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
