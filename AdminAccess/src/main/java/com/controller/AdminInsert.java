package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.AddRole;
import com.service.ServiceImpli;

/**
 * Servlet implementation class AdminInsert
 */
public class AdminInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int empid=Integer.parseInt(request.getParameter("empid"));
		String fname=request.getParameter("fname");
		String sname=request.getParameter("sname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String role=request.getParameter("role");
		AddRole addRole=new AddRole(empid, fname, sname, password, email, role);
		ServiceImpli impli=new ServiceImpli();
		impli.adminInsert(addRole);
		pw.print("<h1>SuccessfullyInserted<h1>");
		pw.close();
		
		
		doGet(request, response);
	}

}
