package com.service;

import java.util.List;

import com.dao.DaoClaImpli;
import com.model.Employee;

public class ServiceImpli implements ServiceInt {
DaoClaImpli daoi=new DaoClaImpli();
	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		daoi.insert(employee);
		
	}
	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return daoi.getAll();
	}
	@Override
	public void update(Employee employee) {
	daoi.update(employee);
		
	}
	
	

}
