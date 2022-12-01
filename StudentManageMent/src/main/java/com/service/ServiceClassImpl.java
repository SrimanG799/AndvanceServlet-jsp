package com.service;

import java.util.List;

import com.dao.DaoCla;
import com.dao.DaoClaImpli;
import com.model.Student;


public class ServiceClassImpl implements ServiceCla{
	DaoClaImpli dao=new DaoClaImpli();
	
	public List<Student> getAllStu() {
		
		return dao.getAllStu();
	}
	public void insert(Student student) {
		dao.insert(student);
		
	}
	public void delete(int id) {
	dao.delete(id);
		
	}
	public void updateAll(Student student) {
	 dao.updateAll(student);
		
	}

}
