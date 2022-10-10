package com.Olympic.Olympic2022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@CrossOrigin(origins = "*")
public class Olympic2022Application {

	public static void main(String[] args) {
		SpringApplication.run(Olympic2022Application.class, args);
	}

}
