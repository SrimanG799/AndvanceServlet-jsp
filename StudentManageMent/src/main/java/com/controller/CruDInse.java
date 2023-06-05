package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.service.ServiceClassImpl;

/**
 * Servlet implementation class CruDInse
 */
public class CruDInse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CruDInse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int roll=Integer.parseInt(request.getParameter("roll"));
		String name=request.getParameter("name");
		String course=request.getParameter("course");
		String location=request.getParameter("location");
		
		Student student=new Student(roll,name,course,location);
		ServiceClassImpl simpl2=new ServiceClassImpl();
		simpl2.insert(student);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

public void add(int a,int b)
{
System.out.println(a+b);

}
}
