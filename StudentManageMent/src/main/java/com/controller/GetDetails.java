package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.model.Student;
import com.service.ServiceClassImpl;

/**
 * Servlet implementation class GetDetails
 */
public class GetDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		ServiceClassImpl srci=new ServiceClassImpl();
		
		List<Student> sta=srci.getAllStu();
		
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<table border=2px");
		pw.print("<th>");
		pw.print("StudentDetails");
		pw.print("</th>");
		
		
		for (Student student : sta) {
			
			pw.print("<tr>");
			pw.print("<td>"+student.getRoll()+"</td>");
			pw.print("<td>"+student.getName()+"</td>");
			pw.print("<td>"+student.getCourse()+"</td>");
			pw.print("<td>"+student.getLocation()+"</td>");
			pw.print("</tr>");
			
			
		}
		pw.print("</table>");
		pw.print("</html>");
		pw.close();
			
		}
		
		
		
	}


