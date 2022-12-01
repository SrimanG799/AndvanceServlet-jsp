package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.protobuf.Empty;
import com.model.AddRole;
import com.service.ServiceImpli;

/**
 * Servlet implementation class AdminUpdate
 */
public class AdminUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int empid=Integer.parseInt(request.getParameter("sriman"));
		ServiceImpli impli=new ServiceImpli();
	     AddRole addRole=impli.getbyId(empid);
		request.setAttribute("SrimanAdd", addRole);
		request.getRequestDispatcher("Update.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int empid=Integer.parseInt(request.getParameter("empid"));
		String fname=request.getParameter("fname");
		String sname=request.getParameter("sname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String role=request.getParameter("role");
		AddRole addRole=new AddRole(empid, fname, sname, password, email, role);
		ServiceImpli impli=new ServiceImpli();
		impli.adminUpdate(addRole);
	request.setAttribute("message", "");
	if(addRole.getRole().equals("admin"))
	{
		request.getRequestDispatcher("adgetdetails").forward(request, response);

	}
	if(addRole.getRole().equals("employee")){
		request.getRequestDispatcher("empgetdetails").forward(request, response);
	}
		
	}

}
