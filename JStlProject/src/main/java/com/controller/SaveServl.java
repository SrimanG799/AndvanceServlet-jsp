package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.service.ServiceImpli;

/**
 * Servlet implementation class SaveServl
 */
@WebServlet("/save")
public class SaveServl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServl() {
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
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		int roll=Integer.parseInt(request.getParameter("roll"));
		String name=request.getParameter("name");
		String campany=request.getParameter("campany");
		Double salary=Double.parseDouble(request.getParameter("salary"));
		Employee employee=new Employee(roll, name, campany, salary);
		
		ServiceImpli impli=new ServiceImpli();
		impli.insert(employee);
		doGet(request, response);
	}

}
