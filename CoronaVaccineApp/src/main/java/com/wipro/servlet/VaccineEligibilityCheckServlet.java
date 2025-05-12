package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VaccineEligibilityCheckServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override  //annotation
	public void doGet(HttpServletRequest hreq,HttpServletResponse hres) throws ServletException,IOException {
		
		hres.setContentType("text/html");
		PrintWriter pw=hres.getWriter();
		String pname=hreq.getParameter("pname");
		@SuppressWarnings("unused")   //Annotation
		String paddress=hreq.getParameter("paddrs");
		int page=Integer.parseInt(hreq.getParameter("page"));
		
		if(page<18) {
			pw.println("<h1 style='color:red;text-align:center'>Mr./Miss. "+pname+" You are not Eligible for Corona Vaccination</h1>");
		}
		else {
			pw.println("<h1 style='color:green;text-align:center'>Mr./Miss. "+pname+" You are Eligible for Corona Vaccination</h1>");
		}
		pw.println("<a href='coronavaccine.html'><img src='home.jpeg' width='80' height='80'></a>");
		pw.close();
	}

}
