package com.tyrowebdev.E_Banking.model;

public class Users {

	
	private String ac;
	private String name;
	private String email;
	private String password;
	private String address;
	private String contact;
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	public Users(String password) {
		super();
		this.password = password;
	}

	public Users(String ac, String name, String email, String address, String contact) {
		super();
		this.ac = ac;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contact = contact;
	}

	public Users(String ac, String name, String password, String role) {
		super();
		this.ac = ac;
		this.name = name;
		this.password = password;
		this.role = role;
	}


	public Users(String ac, String name, String email, String password, String address, String contact,String role) {
		super();
		this.ac = ac;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
		this.role= role;
	}
	
	

	public Users(String ac, String name, String role) {
		super();
		this.ac = ac;
		this.name = name;
		this.role = role;
	}



	public Users(String name, String email, String password, String address, String contact,String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
		this.role= role;
	}

	

	public Users(String ac, String password) {
		super();
		this.ac = ac;
		this.password = password;
	}


	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}


}
