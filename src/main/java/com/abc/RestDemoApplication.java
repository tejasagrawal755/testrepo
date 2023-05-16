package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestDemoApplication.class, args);
	}

}
