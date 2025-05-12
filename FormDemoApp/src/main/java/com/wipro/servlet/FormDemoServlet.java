package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormDemoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest hreq,HttpServletResponse hres) throws ServletException,IOException {
		hres.setContentType("text/html");
		PrintWriter pw=hres.getWriter();
		
		String userName=hreq.getParameter("uname");
		String userContact=hreq.getParameter("ucontact");
		String[] s=hreq.getParameterValues("course");
		pw.println("<h1>User Name: "+userName+"<br>");
		pw.println("User Contact: "+userContact+"<br>");
		pw.println("Your Selected Course:<br>");
		for(String s1:s) {
			pw.println(s1+"<br>");
		}
		pw.println("<h1>");
		pw.println("<a href='http://localhost:8080/FormDemoApp/register.html'><img src='images/home.jpeg' width='80' height='80'></a>");
		
	}
}
