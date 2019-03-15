package com.visualpath.user2.repository;

import java.util.List;

import com.visualpath.user2.model.User;

public interface UserCRUDRepositoryCustom {
	
List<User> getUsersByNameandCity(String name, String city);
	
	

}
