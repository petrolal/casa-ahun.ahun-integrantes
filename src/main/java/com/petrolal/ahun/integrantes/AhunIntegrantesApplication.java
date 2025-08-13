package com.petrolal.ahun.integrantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AhunIntegrantesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AhunIntegrantesApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AhunIntegrantesApplication.class);
	}

}
