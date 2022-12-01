package com.dao;

import java.util.List;

import com.model.Student;


public interface DaoCla {
	
	
	
	List<Student> getAllStu();
	
	
	void insert(Student student);
	
	
	void delete(int id);
	
	void updateAll(Student student);

}
