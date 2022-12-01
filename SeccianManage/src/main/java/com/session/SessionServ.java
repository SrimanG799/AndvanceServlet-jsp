package com.session;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionServ
 */
public class SessionServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("user");
		String pin=request.getParameter("password");
		if(user.equals("sriman")&&pin.equals("sri@799"))
		{
			request.getRequestDispatcher("Welcome.html").include(request, response);
		}
		else {
			pw.print("<p>passward miss match<p>");
			pw.print("<image src='\"C:\\Users\\srima\\Downloads\\Wrong.jpeg\' width=20%:height=50px>");
			request.getRequestDispatcher("logins.html").include(request, response);
			//response.sendRedirect("logins.html");
			
		}
		pw.close();
		
		
		
		
		doGet(request, response);
	}

}
