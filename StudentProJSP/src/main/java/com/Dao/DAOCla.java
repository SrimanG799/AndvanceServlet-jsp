package com.Dao;

import java.util.List;

import com.model.Employee;

public interface DAOCla {
	
	List<Employee> getDetail();
	
	void insert(Employee employee);
	
	void delete(int roll);
	
	void update(Employee employee);
	
	Employee getbyId(int roll);


}
