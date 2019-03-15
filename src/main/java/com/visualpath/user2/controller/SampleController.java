package com.visualpath.user2.controller;

import java.util.ArrayList;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.visualpath.user2.model.SampleUsers;
import com.visualpath.user2.model.User;

@Component
@Path("/jersey")
public class SampleController {
	
	@Path("/getUsers")
	@Produces("application/xml")
	public SampleUsers getSampleUsers()
	{ 
		ArrayList<User> users=new ArrayList<>(); 
		users.add(new User(1L,"Ganesh1","Noel"));	
		SampleUsers sampleUsers=new SampleUsers();
		sampleUsers.setUsers(users);
		return sampleUsers;
		}

}