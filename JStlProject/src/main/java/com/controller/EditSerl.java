package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.mysql.cj.x.protobuf.MysqlxCrud.Update;
import com.service.ServiceImpli;

/**
 * Servlet implementation class EditSerl
 */
public class EditSerl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditSerl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		int roll=Integer.parseInt(request.getParameter("roll"));
		String name=request.getParameter("name");
		String campany=request.getParameter("campany");
		double salary=Double.parseDouble(request.getParameter("salary"));
		Employee employee=new Employee(roll, name, campany, salary);
		ServiceImpli seru=new ServiceImpli();
		seru.update(employee);
		pw.print("hello");
		
		request.getRequestDispatcher("/findall").include(request, response);
		
		pw.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
