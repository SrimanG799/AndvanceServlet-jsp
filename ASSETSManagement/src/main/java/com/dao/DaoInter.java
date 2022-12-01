package com.dao;

import java.util.List;

import com.model.AddAssets;
import com.model.LoginCla;

public interface DaoInter {
	LoginCla login(String userName);
	
	void addRole(LoginCla loginCla);
	
	void addAssets(AddAssets addAssets);
	
	List<AddAssets> getAssets();

	

}
