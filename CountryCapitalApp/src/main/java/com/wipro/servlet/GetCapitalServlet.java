package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetCapitalServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest hreq,HttpServletResponse hres) throws IOException,ServletException {
		hres.setContentType("text/html");
		PrintWriter pw=hres.getWriter();
		
		int countryCode=Integer.parseInt(hreq.getParameter("country"));
		String[] capitals=new String[] {"New Delhi","Washington DC","Ottawa","Islamabad"};
		String[] countries=new String[] {"India","Usa","Canada","Pakistan"};
		pw.println("<h1>Capital of "+countries[countryCode]+" is "+capitals[countryCode]+"</h1>");
		
		pw.println("<a href='pageurl'><h2 style='color:red;text-align:center'>Home</h2></a>");
		pw.close();
	}

}
