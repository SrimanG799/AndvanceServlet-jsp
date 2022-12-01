package com.model;

public class LoginCla {
	String name;
	String password;
	String role;
	public LoginCla() {
		// TODO Auto-generated constructor stub
	}
	public LoginCla(String name, String password, String role) {
		super();
		this.name = name;
		this.password = password;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "LoginCla [name=" + name + ", password=" + password + ", role=" + role + "]";
	}

	
}
