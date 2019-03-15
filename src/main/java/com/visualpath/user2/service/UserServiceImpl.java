package com.visualpath.user2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visualpath.user2.model.User;
import com.visualpath.user2.repository.UserCRUDRepository;
import com.visualpath.user2.repository.UserRepository;

@Service("UserService")
public class UserServiceImpl implements UserService{

	Optional<T>
	
	@Autowired
	UserCRUDRepository userCRUDRepository;
	
	@Override
	public User findById(Long id) {
		
		//return userRepository.findByID(id);
		return userCRUDRepository.findById(id).get();
	}

	@Override
	public List<User> getUserByName(String name) {
		
		return userCRUDRepository.findByNameIgnoreCase(name);
	}

	@Override
	public List<User> getUserLowerByName(String name) {
		// TODO Auto-generated method stub
		return userCRUDRepository.findByLowerName(name);
	}

	@Override
	public List<User> getUserByNameCity(String name, String address) {
		// TODO Auto-generated method stub
		return userCRUDRepository.getUsersByNameandCity(name, address);
	}
	
	
}
