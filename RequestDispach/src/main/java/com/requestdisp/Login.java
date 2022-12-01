package com.requestdisp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			
			String user=request.getParameter("userName");
			String pw=request.getParameter("password");
			if(user.equals("sriman")&& pw.equals("sri@799")) {
			request.getRequestDispatcher("Welcome").forward(request, response);
				//((HttpServletResponse) request).sendRedirect("register.html");
			}else {
				writer.println("<h5> username or pw incorrect, please login again");
				writer.print("<img src='C:\\Users\\srima\\OneDrive\\Pictures\\pokeman.png'>");
				request.getRequestDispatcher("login.html").include(request,response);
			}
			
			writer.close();
			
	}


	
}

