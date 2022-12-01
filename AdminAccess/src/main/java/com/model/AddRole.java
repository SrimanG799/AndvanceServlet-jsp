package com.model;

public class AddRole {
	
	int empid;
	String fname;
	String sname;
	String password;
	String email;
	String role;
	public AddRole() {
		// TODO Auto-generated constructor stub
	}
	public AddRole(int empid, String fname, String sname, String password, String email, String role) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.sname = sname;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "AddRole [empid=" + empid + ", fname=" + fname + ", sname=" + sname + ", password=" + password
				+ ", email=" + email + ", role=" + role + "]";
	}
	

}
