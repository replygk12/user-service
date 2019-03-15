package com.visualpath.user2.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SampleUsers {
	
	ArrayList<User> users; 	

	public  ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
this.users=users;	
		
	}


}
