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
 * Servlet implementation class DelServ
 */
public class DelServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceClassImpl srvd=new ServiceClassImpl();
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		int roll=Integer.parseInt(request.getParameter("roll"));
		srvd.delete(roll);
		pw.print("<p>");
		pw.print(roll);
		pw.print("</p>");
		
		
		
		
		
		
		
	}

}
