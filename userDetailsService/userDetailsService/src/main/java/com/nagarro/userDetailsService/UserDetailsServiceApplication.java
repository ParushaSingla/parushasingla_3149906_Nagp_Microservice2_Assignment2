package com.nagarro.userDetailsService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.nagarro.userDetailsService"}) 
public class UserDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsServiceApplication.class, args);
	}

}
