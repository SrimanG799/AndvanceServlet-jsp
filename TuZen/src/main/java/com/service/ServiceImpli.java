package com.service;

import java.util.List;

import com.dao.DaoInpmli;
import com.model.StudentRegi;
//import com.sun.org.apache.bcel.internal.generic.NEW;

public class ServiceImpli implements Service {

	DaoInpmli dao=new DaoInpmli();
	public void addDetails(StudentRegi studentRegi) {
		// TODO Auto-generated method stub
		dao.addDetails(studentRegi);
		
	}
	@Override
	public List<StudentRegi> getDetails() {
		// TODO Auto-generated method stub
		return dao.getDetails();
	}
	@Override
	public void updateAll(StudentRegi studentRegi) {
		// TODO Auto-generated method stub
		dao.updateAll(studentRegi);
	}
	@Override
	public void delete(int roll) {
		// TODO Auto-generated method stub
		
		dao.delete(roll);
	}

}
