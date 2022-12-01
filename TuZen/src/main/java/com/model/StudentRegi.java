package com.model;

import java.sql.Array;
import java.util.Arrays;

public class StudentRegi {
	int roll;
	String fname;
	String sname;
	String mobile;
	String email;
	String gender;
	String skill;
	String hobbies;
	String dob;
	String info;
	public StudentRegi() {
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentRegi(int roll,String fname, String sname, String mobile, String email, String gender, String skill,
			String hobbies, String dob, String info) {
		super();
		this.roll=roll;
		this.fname = fname;
		this.sname = sname;
		this.mobile = mobile;
		this.email = email;
		this.gender = gender;
		this.skill = skill;
		this.hobbies = hobbies;
		this.dob = dob;
		this.info = info;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "StudentRegi [roll=roll+fname=" + fname + ", sname=" + sname + ", mobile=" + mobile + ", email=" + email
				+ ", gender=" + gender + ", skill=" + skill + ", hobbies=" + hobbies + ", dob=" + dob
				+ ", info=" + info + "]";
	}


	
		
	}
	


