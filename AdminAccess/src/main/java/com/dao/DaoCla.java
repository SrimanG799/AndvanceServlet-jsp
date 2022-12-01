package com.dao;

import java.util.List;

import com.controller.AdminGetDet;
import com.model.AddRole;

public interface DaoCla {
	
	
	AddRole login(int empid);
	
	
	void adminInsert(AddRole addRole);
	
	
	List<AddRole> adminDetails();
	
	
	void adminDelete(int empid);
	
	
	void adminUpdate(AddRole addRole);
	
	
	
	AddRole getbyId(int empid);
	
	
	
	void delete(int empid);
	
	

}
