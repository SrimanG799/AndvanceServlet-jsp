package com.dao;

import java.util.List;

import com.model.Employee;

public interface DAOInter {
	
	void insert(Employee employee);
	
	 List<Employee> getAll();
	 
	 
	 void update(Employee employee);
	

}
