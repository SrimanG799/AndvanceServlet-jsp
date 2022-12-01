package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.util.UtilConnect;

public class DaoClaImpli implements DAOInter {

	@Override
	public void insert(Employee employee){
		Connection connection=null;
		PreparedStatement pst=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, employee.getRoll());
			pst.setString(2,employee.getName() );
			pst.setString(3,employee.getcampany());
			pst.setDouble(4, employee.getSalary());
			pst.executeUpdate();
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employee=new ArrayList();
		Connection connection=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			connection=UtilConnect.getConnection();
			stmt=connection.prepareStatement("select*from employee");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				Employee emp=new Employee();
				emp.setRoll(rs.getInt("roll"));
				emp.setName(rs.getString("name"));
				emp.setcampany(rs.getString("campany"));
				emp.setSalary(rs.getDouble("salary"));
				employee.add(emp);
				
				
			}
			
			
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return employee;
	
	}

	@Override
	public void update(Employee employee) {
	Connection connection=null;
	PreparedStatement pst=null;
	try {
		
		connection=UtilConnect.getConnection();
		pst=connection.prepareStatement("update employee set name=?,campany=?,salary=? where roll=?");
		pst.setString(1, employee.getName());
		pst.setString(2, employee.getcampany());
		pst.setDouble(3, employee.getSalary());
		pst.setInt(4, employee.getRoll());
		pst.executeUpdate();
		
	}
	catch (Exception e) {
	e.printStackTrace();
	}
		
	}
	
	

}