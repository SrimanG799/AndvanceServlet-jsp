package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.StudentRegi;
import com.service.ServiceImpli;

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
		
		int roll=Integer.parseInt(request.getParameter("regnum"));
		String fname=request.getParameter("first");
		String sname=request.getParameter("second");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String skill=request.getParameter("skill");
		String[] hobbies=request.getParameterValues("id");
		String hb=" ";
		for(int i=0;i<hobbies.length;i++)
		{
		hb+=hobbies[i]+" ";
		}
		String info=request.getParameter("info");
		String dob=request.getParameter("dob");
		
		
		
		StudentRegi studentRegi=new StudentRegi(roll, fname, sname, mobile, email, gender, skill, hb, dob, info);
		ServiceImpli impli=new ServiceImpli();
		impli.updateAll(studentRegi);
		
		
		
		
		request.getRequestDispatcher("GetDeatails").forward(request, response);
		
		
		
		
		doGet(request, response);
	}

}
