package com.visualpath.user2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.visualpath.user2.model.User;
import com.visualpath.user2.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/user/{id}", method =RequestMethod.GET )
	public User getUserByID(@PathVariable("id") long id) {
	return userService.findById(id);
	}
	

	@RequestMapping(value = "/userByName/{name}", method =RequestMethod.GET )
	public List<User> getUserByName(@PathVariable("name") String name) {
	return userService.getUserByName(name);
	}
	

	@RequestMapping(value = "/userByLowerName/{name}", method =RequestMethod.GET )
	public List<User> getUserByLowerName(@PathVariable("name") String name) {
	return userService.getUserLowerByName(name);
	}
	
	@RequestMapping(value = "/userbyNameOrCity", method =RequestMethod.GET)
	public List<User> getUserByNameCity(@RequestParam(value="name",required=false) String name,@RequestParam(value="address",required=false) String address) {
		return userService.getUserByNameCity(name, address);		
	
	}
	
	
	
	
	/*@RequestMapping(value = "/user/{id}", method =RequestMethod.PUT )
	public User updateUserByID(@PathVariable("id") long id) {
	return userService.
	}
*/
	/*@RequestMapping(value="/getUsers",produces={ "application/json" })
public SampleUsers getSampleUsers()
{ 
	ArrayList<User> users=new ArrayList<>(); 
	users.add(new User(1L,"Ganesh1","Noel"));	
	SampleUsers sampleUsers=new SampleUsers();
	sampleUsers.setUsers(users);
	return sampleUsers;
	}
	*/
	


}
