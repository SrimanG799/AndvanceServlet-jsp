package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.AddAssets;
import com.model.LoginCla;
import com.sun.tools.javac.launcher.Main;
import com.util.UtilConnect;

public class DAoIMPLI implements DaoInter {

	public LoginCla login(String userName) {
		//LoginCla loglist=new ArrayList();
		LoginCla log=new LoginCla();
		
		Connection connection=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			connection=UtilConnect.getConnection();
			pst=connection.prepareStatement("select*from lab where name=?");
			pst.setString(1, userName);
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				
				
				log.setName(rs.getString(1));
				log.setPassword(rs.getString(2));
				log.setRole(rs.getString(3));
				//loglist.add(log);
				
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	
	
		return log;

}
	public void addRole(LoginCla loginCla) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			connection=UtilConnect.getConnection();
			ps=connection.prepareStatement("insert into lab values(?,?,?)");
		
			ps.setString(1, loginCla.getName());
			ps.setString(2, loginCla.getPassword());
			ps.setString(3, loginCla.getRole());
			ps.executeUpdate();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}

	public void addAssets(AddAssets addAssets) {
		Connection connection=null;
		PreparedStatement ps =null;
		try {
			connection=UtilConnect.getConnection();
			ps=connection.prepareStatement("insert into assets values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, addAssets.getRfid());
			ps.setString(2, addAssets.getAssetTag());
			ps.setInt(3, addAssets.getSerialNumber());
			ps.setString(4,addAssets.getDescription());
			ps.setString(5, addAssets.getFirendlyName());
			ps.setString(6, addAssets.getModel());
			ps.setString(7, addAssets.getManufacturer());
			ps.setString(8, addAssets .getDate());
			ps.setDouble(9, addAssets.getCost());
			ps.setString(10, addAssets.getRoom());
			ps.setString(11, addAssets.getpContact());
			ps.setString(12, addAssets.getSecContact());
			ps.executeUpdate();
			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public List<AddAssets> getAssets() {
		Connection connection=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<AddAssets> addAssets=new ArrayList<AddAssets>();
		try {
			connection=UtilConnect.getConnection();
		pst=connection.prepareStatement("select*from assets");
		rs=pst.executeQuery();
		while(rs.next())
		{
			AddAssets add=new AddAssets();
			add.setRfid(rs.getString(1));
			add.setAssetTag(rs.getString(2));
			add.setSerialNumber(rs.getInt(3));
			add.setDescription(rs.getString(4));
			add.setFirendlyName(rs.getString(5));
			add.setModel(rs.getString(6));
			add.setManufacturer(rs.getString(7));
			add.setDate(rs.getString(8));
			add.setCost(rs.getDouble(9));
			add.setRoom(rs.getString(10));
			add.setpContact(rs.getString(11));
			add.setSecContact(rs.getString(12));
			addAssets.add(add);
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return addAssets;
	}
	
	
	//public static void main(String[] args) {
//DAoIMPLI d=new DAoIMPLI();
//AddAssets aAddAssets=new AddAssets("ab12", "astbv12", 112, "glasstube", "tube1", "115", "reddylab", "2022/11/17", 600, "rm001", "lab@1", "ablab@1");

//d.addAssets(aAddAssets);

//	System.out.println(d.login("sriman"));
//	System.out.println(d.login("mahi"));
//	LoginCla loginCla=new LoginCla("ramya", "potii@minni", "employe");
//d.addRole(loginCla);
	//}
	
	
	//System.out.println(d.getAssets());
	
	
	
	
	
}

//}