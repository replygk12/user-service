package com.visualpath.user2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.visualpath.user2.model.User;

public interface UserCRUDRepository extends JpaRepository<User, Long>, UserCRUDRepositoryCustom {
	
	public List<User> findByNameIgnoreCase(String name);
	
	public List<User> findByLowerName(String name);
	
}
