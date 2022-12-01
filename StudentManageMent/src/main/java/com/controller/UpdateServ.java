package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.service.ServiceClassImpl;
import com.utildb.UtilConnect;

/**
 * Servlet implementation class UpdateServ
 */
public class UpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=	response.getWriter();
	int roll=Integer.parseInt(request.getParameter("roll"));
	String name=request.getParameter("name");
	String course=request.getParameter("course");
	String location=request.getParameter("location");
	Student student=new Student(roll,name,course,location);
	ServiceClassImpl srda=new ServiceClassImpl();
	
	 srda.updateAll(student);
	 
	 request.getRequestDispatcher("GetDetails").forward(request, response);
	
	}
	

	}


