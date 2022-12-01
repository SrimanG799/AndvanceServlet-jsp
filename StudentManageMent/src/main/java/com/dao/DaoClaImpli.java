package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

import com.utildb.UtilConnect;

public class DaoClaImpli implements DaoCla {

	public List<Student> getAllStu() {
		
		List<Student> stud=new ArrayList<Student>();
		Connection connection=null;
		PreparedStatement pst=null;
		Statement stmt=null;
		ResultSet rst=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("select*from Student");
		rst=pst.executeQuery();
		while(rst.next())
		{
			Student stu=new Student();
			stu.setRoll(rst.getInt("roll"));
			stu.setName(rst.getString("name") );
			stu.setCourse(rst.getString("course"));
			stu.setLocation(rst.getString("loacation"));
			stud.add(stu);
		}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return stud;
		
		
		
		
		}
//	public static void main(String[] args) {
//		
//		
//		DaoClaImpli d=new DaoClaImpli();
//		System.out.println(d.getAllStu());
//		
	//}
	public void insert(Student student) {
		Connection connection=null;
		Statement stmt=null;
		PreparedStatement pst=null;
		ResultSet rst=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("insert into Student values(?,?,?,?)");
			pst.setInt(1,student.getRoll());
			pst.setString(2,student.getName());
			pst.setString(3,student.getCourse());
			pst.setString(4,student.getLocation());
			pst.executeUpdate();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	public void delete(int id ) {
		
		Connection connection=null;
		Statement stmt=null;
		PreparedStatement pst=null;
		ResultSet rst=null;
	try {
		connection=UtilConnect.getConnection();
		pst=connection.prepareStatement("delete from student where roll=?");
		pst.setInt(1,id);
		pst.executeUpdate();		
		
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
		
	}
	public void updateAll(Student student) {
		Connection connection=null;
		PreparedStatement pst=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("update student set name=?,course=?,loacation=? where roll=?");
			pst.setString(1,student.getName());
			pst.setString(2,student.getCourse());
			pst.setString(3,student.getName());
			pst.setInt(4,student.getRoll());
			pst.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
		
		
	}
	
		
	
}
			
			
			
		
