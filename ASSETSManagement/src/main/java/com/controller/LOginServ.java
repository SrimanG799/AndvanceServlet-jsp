package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.LoginCla;
import com.service.ServiceImpli;

/**
 * Servlet implementation class LOginServ
 */
public class LOginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LOginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String userName=request.getParameter("username");
		String lpassword=request.getParameter("password");
		//String lrole=request.getParameter("role");
		ServiceImpli serv=new ServiceImpli();
		LoginCla logcla= serv.login(userName);
		//List<LoginCla> ga=new ArrayList();
		//ga.add(logcla);
		//request.setAttribute("Details", ga);
		if(lpassword.equals( logcla.getPassword()))
		{
			request.getRequestDispatcher("assets.jsp").forward(request, response);
		}
		else {
	       request.getRequestDispatcher("login.html").include(request, response);
	       pw.print("<h1>DetailsMissmatch<h1>");
		}
		
		doGet(request, response);
	}

}
