package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.AddAssets;
import com.service.ServiceImpli;

/**
 * Servlet implementation class ADDAsset
 */
public class ADDAsset extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ADDAsset() {
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
	

 String rfid=request.getParameter("rfid");
 String assetTag=request.getParameter("assetTag");
 
   int serialNumber=Integer.parseInt(request.getParameter("serialNumber"));
	String description=request.getParameter("description");
	 String friendlyName=request.getParameter("friendlyName");
	 
	String model=request.getParameter("model");
	
	 String manufacturer=request.getParameter("manufacturer");
	 String date=request.getParameter("date");
	 
 double cost=Double.parseDouble(request.getParameter("cost"));
	String room=request.getParameter("room");
	String pContact=request.getParameter("pContact");
	 String secContact=request.getParameter("secContact");
	 AddAssets addAssets=new AddAssets(rfid, assetTag, serialNumber, description, friendlyName, model, manufacturer, date, cost, room, pContact, secContact);
	
	//AddAssets addAssets=new AddAssets("afaf", "gfgfgf", 115, "jdjjdd", "yhjik", "yhjd", "srlab", "2022/11/20", 600, "jkj3", "huhyhg", "uhyyg") ;
	 
	 
	 ServiceImpli servImpli=new ServiceImpli();
	servImpli.addAssets(addAssets);
	
		
		
		
		
		doGet(request, response);
		request.getRequestDispatcher("getdetails").forward(request, response);
	}

}
