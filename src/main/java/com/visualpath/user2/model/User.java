package com.visualpath.user2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQuery(name = "User.findByLowerName", query = "SELECT u FROM User u WHERE u.name = LOWER(?1)")
//@XmlRootElement
public class User {
@Id
@GeneratedValue
private Long id;

private String name;

@Column(columnDefinition="text")	
private String address;

public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Long id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
