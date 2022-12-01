package com.service;

import java.util.List;

import com.model.Employee;

public interface ServiceInt {
	
	void insert(Employee employee);
	
	 List<Employee> getAll();
	 
	 void update(Employee employee);
	 

}
