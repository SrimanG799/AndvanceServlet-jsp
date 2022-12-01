package com.service;

import java.util.List;

import com.Dao.DAOIMPLI;
import com.model.Employee;

public class ServiceImpli implements Service {
DAOIMPLI Daoi=new DAOIMPLI();

	public List<Employee> getDetail() {
		// TODO Auto-generated method stub
		return Daoi.getDetail();
	}

	
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		Daoi.insert(employee);
	}

	
	public void delete(int roll) {
		Daoi.delete(roll);
		
		
	}

	
	public void update(Employee employee) {
	Daoi.update(employee);
		
	}

	
	public Employee getbyId(int roll) {
		// TODO Auto-generated method stub
		return Daoi.getbyId(roll);
	}
	

}
