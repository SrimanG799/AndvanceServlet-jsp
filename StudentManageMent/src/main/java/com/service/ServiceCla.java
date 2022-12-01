package com.service;

import java.util.List;

import com.model.Student;

public interface ServiceCla {
	List<Student> getAllStu();
	
	void insert(Student student);
	
	void delete(int id);

	
	void updateAll(Student student);
}
