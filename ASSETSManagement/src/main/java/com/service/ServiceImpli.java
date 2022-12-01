package com.service;

import java.util.List;

import com.dao.DAoIMPLI;
import com.model.AddAssets;
import com.model.LoginCla;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class ServiceImpli implements SrervInte {

	DAoIMPLI dAo=new DAoIMPLI();
	public LoginCla login(String userName) {
		// TODO Auto-generated method stub
		return dAo.login(userName);
	}
	public void addRole(LoginCla loginCla) {
		// TODO Auto-generated method stub
		dAo.addRole(loginCla);
	}
	public void addAssets(AddAssets addAssets) {
		// TODO Auto-generated method stub
		dAo.addAssets(addAssets);
		
	}
	public List<AddAssets> getAssets() {
		// TODO Auto-generated method stub
		return dAo.getAssets();
	}
	
	

}
