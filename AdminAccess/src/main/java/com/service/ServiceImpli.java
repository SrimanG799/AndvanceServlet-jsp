package com.service;

import java.util.List;

import com.dao.DaoImpli;
import com.model.AddRole;

public class ServiceImpli implements ServiceCla {
DaoImpli dao=new DaoImpli();
	public AddRole login(int empid) {
		// TODO Auto-generated method stub
		return dao.login(empid);
	}
	public void adminInsert(AddRole addRole) {
		dao.adminInsert(addRole);
		
	}
	public List<AddRole> adminDetails() {
		// TODO Auto-generated method stub
		return dao.adminDetails();
	}
	public void adminDelete(int empid) {
		// TODO Auto-generated method stub
		dao.adminDelete(empid);
	}
	public void adminUpdate(AddRole addRole) {
		// TODO Auto-generated method stub
		dao.adminUpdate(addRole);
	}
	public AddRole getbyId(int empid) {
		// TODO Auto-generated method stub
		return dao.getbyId(empid);
	}
	public void delete(int empid) {
		// TODO Auto-generated method stub
		dao.delete(empid);
	}
	

}
