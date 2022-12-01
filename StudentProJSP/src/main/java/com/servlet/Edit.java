package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.runtime.ProtectedFunctionMapper;

import com.model.Employee;
import com.service.ServiceImpli;


/**
 * Servlet implementation class Edit
 */
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	int roll=Integer.parseInt(request.getParameter("sriman"));
	ServiceImpli sev=new ServiceImpli();
	Employee emp=sev.getbyId(roll);
	request.setAttribute("mahesh",emp );
	request.getRequestDispatcher("/EDit.jsp").forward(request, response);
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	

		
		response.setContentType("text/html");
		PrintWriter pc=response.getWriter();
		int roll=Integer.parseInt(request.getParameter("roll"));
		String name=request.getParameter("name");
		String campany=request.getParameter("campany");
		double salary=Double.parseDouble(request.getParameter("salary"));
		Employee employee=new Employee(roll, name, campany, salary);
		
		ServiceImpli serviceImpli=new ServiceImpli();
		serviceImpli.update(employee);
		request.setAttribute("emp", employee);
		request.getRequestDispatcher("/GetServL");
		
		
		
	}

}
