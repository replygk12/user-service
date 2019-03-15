package com.visualpath.user2.service;

import java.util.List;
import java.util.Optional;

import com.visualpath.user2.model.User;

public interface UserService {
	
	User findById(Long id);
	
	List<User> getUserByName(String name);

	List<User> getUserLowerByName(String name);

	List<User> getUserByNameCity(String name, String address);

	

}
