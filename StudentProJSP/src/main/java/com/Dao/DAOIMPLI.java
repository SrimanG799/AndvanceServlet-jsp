package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.util.UtilConnect;

public class DAOIMPLI implements DAOCla{

	public List<Employee> getDetail() {
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
			emp.setCampany(rs.getString("campany"));
			emp.setSalary(rs.getDouble("salary"));
			employee.add(emp);
			
			
		}
		
		return employee;
		
	}catch (Exception e) {
	e.printStackTrace();
	}
	
		return null;
	}

	
	public void insert(Employee employee) {
		Connection connection=null;
		PreparedStatement pst=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1,employee.getRoll());
			pst.setString(2,employee.getName());
			pst.setString(3,employee.getCampany());
			pst.setDouble(4,employee.getSalary());
			pst.executeUpdate();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}


	public void delete(int roll) {
		
		Connection connection=null;
		PreparedStatement pst =null;
		try {
			connection=UtilConnect.getConnection();
			
			pst=connection.prepareStatement("delete from employee where roll=?");
			
			pst.setInt(1, roll);
			pst.executeUpdate();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		
	}

	public void update(Employee employee) {

		Connection connection=null;
		PreparedStatement pst =null;
		try {
			connection=UtilConnect.getConnection();
			
			pst=connection.prepareStatement("update table employe set name=?,campany=?,salary=? where roll=?");
			
			
			pst.setString(1,employee.getName());
			pst.setString(2, employee.getCampany());
			pst.setDouble(3, employee.getSalary());
			pst.setInt(4, employee.getRoll());
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	
		
	}
	public static void main(String[] args) {
		
		//Employee employee=new Employee(100,"sriman","iqteck",15000);
		
		DAOIMPLI cl=new DAOIMPLI();
		//cl.insert(employee);
		
		
		//System.out.println(cl);
	System.out.println(cl.getbyId(100));
	
	}


	public Employee getbyId(int roll) {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("select *from employee where roll=?");
			pst.setInt(1, roll);
		rs=	pst.executeQuery();
		Employee employee=new Employee();
			while(rs.next())
			{
				
				employee.setRoll(rs.getInt("roll"));
				employee.setName(rs.getString("name"));
				employee.setCampany(rs.getString("campany"));
				employee.setSalary(rs.getDouble("salary"));
			
				
				
			}
			return employee;
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
