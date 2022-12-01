package com.service;

import java.util.List;

import com.model.StudentRegi;

public interface Service {
	void addDetails(StudentRegi studentRegi);
	
	List<StudentRegi> getDetails();
	void updateAll(StudentRegi studentRegi);
	
	void delete(int roll);

}
