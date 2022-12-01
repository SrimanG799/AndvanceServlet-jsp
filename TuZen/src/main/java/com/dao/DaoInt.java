package com.dao;

import java.util.List;

import com.model.StudentRegi;

public interface DaoInt {
	void addDetails(StudentRegi studentRegi);
	
	List<StudentRegi> getDetails();
	void updateAll(StudentRegi studentRegi);
	void delete(int roll);

}
