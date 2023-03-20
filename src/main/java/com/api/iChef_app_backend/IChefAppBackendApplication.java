package com.api.iChef_app_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 *
 * LocalHost swagger - http://localhost:8081/swagger-ui.html
 * LocalHost Aplicação - http://localhost:8081
 * */

@SpringBootApplication
public class IChefAppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(IChefAppBackendApplication.class, args);
	}
}
