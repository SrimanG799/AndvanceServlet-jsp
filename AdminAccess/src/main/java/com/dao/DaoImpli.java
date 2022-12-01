package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.AddRole;
import com.service.ServiceImpli;
import com.util.UtilConnect;

public class DaoImpli implements DaoCla {

	public AddRole login(int empid) {
		AddRole addRole=new AddRole();
		Connection connection=null;
		PreparedStatement pst=null;
		ResultSet rSet=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("select * from AdminRole where empid=? ");
			pst.setInt(1,empid);
			rSet=pst.executeQuery();
			while(rSet.next())
			{
				addRole.setEmpid(rSet.getInt(1));
				addRole.setFname(rSet.getString(2));
				addRole.setSname(rSet.getString(3));
				addRole.setPassword(rSet.getString(4));
				addRole.setEmail(rSet.getString(5));
				addRole.setRole(rSet.getString(6));
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return addRole;
	}
	

	


public void adminInsert(AddRole addRole) {

	Connection connection=null;
	PreparedStatement pst=null;
	try {
		connection=UtilConnect.getConnection();
		pst=connection.prepareStatement("insert into adminrole values(?,?,?,?,?,?)");
		pst.setInt(1, addRole.getEmpid());
		pst.setString(2, addRole.getFname());
		pst.setString(3, addRole.getSname());
		pst.setString(4, addRole.getPassword());
		pst.setString(5,addRole.getEmail() );
		pst.setString(6, addRole.getRole());
		pst.executeUpdate();
	
	
}catch(Exception e)
	{
	e.printStackTrace();
	}
	
}

public List<AddRole> adminDetails() {
	List<AddRole> addRoles=new ArrayList();
	Connection connection=null;
	PreparedStatement pst =null;
	ResultSet rs=null;
	try {
		connection =UtilConnect.getConnection();
		pst=connection.prepareStatement("select * from adminrole");
		rs=pst.executeQuery();
		while(rs.next())
		{
			AddRole add=new AddRole();
			add.setEmpid(rs.getInt(1));
			add.setFname(rs.getString(2));
			add.setSname(rs.getString(3));
			add.setPassword(rs.getString(4));
			add.setEmail(rs.getString(5));
			add.setRole(rs.getString(6));
			addRoles.add(add);
			
		}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return addRoles;
}
public void adminDelete(int empid) {
	Connection connection=null;
	PreparedStatement  ps=null;
	try {
		connection=UtilConnect.getConnection();
		ps=connection.prepareStatement("delete from adminrole where empid=?");
		ps.setInt(1,empid);
		ps.executeUpdate();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

public void adminUpdate(AddRole addRole) {

	Connection connection=null;
	PreparedStatement pst=null;
	try {
		connection=UtilConnect.getConnection();
		pst=connection.prepareStatement("update adminrole set fname=?,sname=?,password=?,email=?,role=? where empid=? ");
		pst.setInt(6, addRole.getEmpid());
		pst.setString(1, addRole.getFname());
		pst.setString(2, addRole.getSname());
		pst.setString(3, addRole.getPassword());
		pst.setString(4,addRole.getEmail() );
		pst.setString(5, addRole.getRole());
		pst.executeUpdate();
	
	
}catch(Exception e)
	{
	e.printStackTrace();
	}
	
	// TODO Auto-generated method stub
	
}

public AddRole getbyId(int empid) {
	AddRole add=new AddRole();
	Connection connection=null;
	PreparedStatement pst =null;
	ResultSet rs=null;
	try {
		
		connection =UtilConnect.getConnection();
		pst=connection.prepareStatement("select * from adminrole where empid=?");
		pst.setInt(1, empid);
		rs=pst.executeQuery();
		while(rs.next())
		{
			
			add.setEmpid(rs.getInt(1));
			add.setFname(rs.getString(2));
			add.setSname(rs.getString(3));
			add.setPassword(rs.getString(4));
			add.setEmail(rs.getString(5));
			add.setRole(rs.getString(6));
			
			
		}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return add;
	
	
}
public void delete(int empid) {
	Connection connection=null;
	PreparedStatement ps=null;
	try {
		connection=UtilConnect.getConnection();
		ps=connection.prepareStatement("delete from adminrole where empid=?");
		ps.setInt(1, empid);
		ps.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}


//public static void main(String[] args ) {
	
	
	//ServiceImpli Impli=new ServiceImpli();
	
	//AddRole  asAddRole=serviceImpli.login(111);
	//System.out.println(asAddRole.toString());
//List<AddRole> addRole= serviceImpli.adminDetails();
	//System.out.println(addRole);
	//Impli.adminDelete(111);
	//AddRole addRole=new AddRole(112, "mohan", "krishna", "mohan1", "moh@gmail.com", "employee");
	//Impli.adminUpdate(addRole);
	
	
	//System.out.print(Impli.getbyId(112));
	//Impli.delete(112);

}








