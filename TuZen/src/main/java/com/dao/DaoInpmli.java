package com.dao;

import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.apache.coyote.http11.Http11AprProtocol;

import com.model.StudentRegi;
import com.service.ServiceImpli;
import com.util.UtilConnect;

public class DaoInpmli implements DaoInt{

	public void addDetails(StudentRegi studentRegi) {
		// TODO Auto-generated method stub
		
		
		Connection connection=null;
		PreparedStatement pst=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("insert into tuzen values(?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, studentRegi.getFname());
			pst.setString(2, studentRegi.getSname());
			pst.setString(3, studentRegi.getMobile());
			pst.setString(4,studentRegi.getEmail() );
			pst.setString(5, studentRegi.getGender());
			pst.setString(6,studentRegi.getSkill() );
			pst.setObject(7, studentRegi.getHobbies());
			pst.setString(8, studentRegi.getInfo());
			pst.setString(9,studentRegi.getDob());
			pst.setInt(10, studentRegi.getRoll());
			pst.executeUpdate();
			
			
			
		}
		
		catch(Exception e)
		{
			
		
			e.printStackTrace();
		}
	}
		
		
		
	


	public List<StudentRegi> getDetails() {
		List<StudentRegi> studentRegis=new ArrayList<>();
		Connection connection=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
	
			
	connection=UtilConnect.getConnection();
	try {
		pst=connection.prepareStatement("select*from tuzen");
		rs=pst.executeQuery();
		while(rs.next())
		{
			StudentRegi reg=new StudentRegi();
			reg.setFname(rs.getString(1));
			reg.setSname(rs.getString(2));
			reg.setMobile(rs.getString(3));
			reg.setEmail(rs.getString(4));
			reg.setGender(rs.getString(5));
			reg.setSkill(rs.getString(6));
			reg.setHobbies(rs.getString(7));
			reg.setDob(rs.getString(8));
			reg.setInfo(rs.getString(9));
			reg.setRoll(rs.getInt(10));
			studentRegis.add(reg);

		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
		
		
		return studentRegis;
	}
	






	@Override
	public void updateAll(StudentRegi studentRegi) {
		// TODO Auto-generated method stub

		Connection connection=null;
		PreparedStatement pst=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("update tuzen set fname=?,sname=?,mobile=?,email=?,gender=?,skill=?,hobbies=?,Additinaol=?,Dob=? where roll=?");
			pst.setString(1, studentRegi.getFname());
			pst.setString(2, studentRegi.getSname());
			pst.setString(3, studentRegi.getMobile());
			pst.setString(4,studentRegi.getEmail() );
			pst.setString(5, studentRegi.getGender());
			pst.setString(6,studentRegi.getSkill() );
		
			String  hob=studentRegi.getHobbies();
			
			pst.setObject(7, hob);
			pst.setString(8, studentRegi.getInfo());
			pst.setString(9,studentRegi.getDob());
			pst.setInt(10, studentRegi.getRoll());
			pst.executeUpdate();
			
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}






	@Override
	public void delete(int roll) {
		Connection connection=null;
		PreparedStatement pst=null;
	try {
		connection=UtilConnect.getConnection();
		pst=connection.prepareStatement("delete from tuzen where roll=?");
		pst.setInt(1, roll);
		pst.executeUpdate();
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
	}
	
//	public static void main(String[] args)
//	{
//		
//		ServiceImpli impli=new ServiceImpli();
//		impli.delete(1);
//		
//	}
}