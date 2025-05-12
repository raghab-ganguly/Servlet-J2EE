package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FetchSysPropsServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest hreq,HttpServletResponse hres) throws ServletException,IOException  {
		hres.setContentType("text/html");
		PrintWriter pw=hres.getWriter();
		
		//get all system properties
		Properties props=System.getProperties();
		pw.println(props);
		pw.println("<br><br><a href='http://localhost:8080/FetchSysPropsServlet/home.html'><img src='home.jpeg' width='100' height='100'></a>");
	
		pw.close();
	}

}
