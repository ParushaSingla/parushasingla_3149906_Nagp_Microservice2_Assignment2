package com.nagarro.userDetailsService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagarro.userDetailsService.model.User;

@Repository
public interface UserServiceDao extends JpaRepository<User, Integer> {


}
