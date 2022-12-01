package com.service;

import java.util.List;

import com.model.AddRole;

public interface ServiceCla {
	
	AddRole login(int empid);
	void adminInsert(AddRole addRole);
	List<AddRole> adminDetails();
	void adminDelete(int empid);
	
	void adminUpdate(AddRole addRole);
	
	AddRole getbyId(int empid);

	public void delete(int empid);
		// TODO Auto-generated method stub
		
	

}
