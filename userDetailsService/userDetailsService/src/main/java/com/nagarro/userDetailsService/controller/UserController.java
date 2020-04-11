package com.nagarro.userDetailsService.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.userDetailsService.model.User;
import com.nagarro.userDetailsService.service.UserDetailService;

@RestController
@Component
@ComponentScan("com.nagarro.userService")
public class UserController {

	@Autowired
	UserDetailService userDetailService;

	@GetMapping("user/{id}")
	public Optional<User> userDetails(@PathVariable("id") int id) {

		return userDetailService.userDetails(id);

	}
}
