package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utildb.UtilConnect;

/**
 * Servlet implementation class StuInsert
 */
public class StuInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StuInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		int roll=Integer.parseInt(request.getParameter("roll"));
		String name=request.getParameter("name");
		String course=request.getParameter("course");
		String location=request.getParameter("location");
		Connection connection=null;
		Statement stmt=null;
	   PreparedStatement pst=null;
	   ResultSet rst=null;
	   try {
		   connection=UtilConnect.getConnection();
		   pst=connection.prepareStatement("insert into student values(?,?,?,?)");
		   pst.setInt(1,roll);
		   pst.setString(2,name);
		   pst.setString(3,course);
		   pst.setString(4,location);
		int r= pst.executeUpdate();
		if(r==1)
		{
			pw.print("<html>");
			pw.print("<body>");
			pw.print("<h1>"+"insertion is success"+"</h1>");
			pw.print("</body>");
			pw.print("</html>");
		
		
		}
		   
	   }
	   catch (Exception e) {
		// TODO: handle exception
		   e.printStackTrace();
	}
	   finally {
		   try {
			   UtilConnect.closeConnection(stmt, rst, pst);
			   UtilConnect.closeConnection();
			   
		   }catch (Exception e) {
			// TODO: handle exception
			   e.printStackTrace();
		}
			   
			   
		   
	   }
		   
		   
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
