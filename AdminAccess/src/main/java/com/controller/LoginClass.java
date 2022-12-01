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
 * Servlet implementation class LoginClass
 */
public class LoginClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int empid=Integer.parseInt(request.getParameter("empid"));
		String password=request.getParameter("password");
		ServiceImpli impli=new ServiceImpli();
		
		
		AddRole addRole=impli.login(empid);
		
		request.setAttribute("addrole", addRole);
		
		if(password.equals(addRole.getPassword())&&addRole.getRole().equals("employee")) {
		
			request.getRequestDispatcher("Employee.jsp").forward(request, response);
		}
		else if(password.equals(addRole.getPassword())&&addRole.getRole().equals("admin"))
	 
	 {
		 request.getRequestDispatcher("Admin.jsp").forward(request,response);
		 
		 
	 }else {
		 request.setAttribute("msg","deatails missmatch");	 
		 request.getRequestDispatcher("login.jsp").forward(request,response);
		 
	 }
	
		 
		 
	 
		
		
		
		doGet(request, response);
	}

}
