package com.nagarro.userDetailsService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.userDetailsService.dao.UserServiceDao;
import com.nagarro.userDetailsService.model.User;

@Service
public class UserDetailService {
	@Autowired
	UserServiceDao userServiceDao;

	public Optional<User> userDetails(int id) {
		return userServiceDao.findById(id);
	}
}
