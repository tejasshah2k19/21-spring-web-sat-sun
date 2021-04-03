package com.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class UserBean {

	@NotEmpty(message="Please Enter FirstName")
	private String firstName;

	@NotEmpty(message="Please Enter Email")
	String email;

	
	String password, lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}