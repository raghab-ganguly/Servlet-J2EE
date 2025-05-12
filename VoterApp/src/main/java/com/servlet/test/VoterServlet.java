package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	// for GET Mode Request processing
	public void doGet(HttpServletRequest hreq, HttpServletResponse hres) throws IOException, ServletException {
		PrintWriter pw = hres.getWriter();
		hres.setContentType("text/html");
		pw.println("<h1 style='color:green ; text-align:center'>The System Date and Tyme is :: " + new Date()
				+ "</h1><br /><br /><br />");
		pw.println("<a href='form.html'><img src='images/home.jpg' width='100' height='100' /></a>");
		pw.close();
	}

	@Override
	// for POST Mode Request processing
	public void doPost(HttpServletRequest hreq, HttpServletResponse hres) throws IOException, ServletException {
		PrintWriter pw = hres.getWriter();
		hres.setContentType("text/html");

		// Voter Eligibility Checking logic
		String pname = hreq.getParameter("pname");
		@SuppressWarnings("unused")
		String padrs = hreq.getParameter("padrs");
		int page = Integer.parseInt(hreq.getParameter("page"));

		if (page >= 18) {
			pw.println("<h1 style='color:green ; text-align:center'>Mr./Mrs./Miss " + pname +",you are Eligible for Voting!!</h1><br /><br /><br />");
		} else {
			pw.println("<h1 style='color:red ; text-align:center'>Mr./Mrs./Miss " + pname
					+ " ,you are not Eligible for Voting!!</h1><br /><br /><br />");
		}
		pw.println("<a href='form.html'><img src='images/home.jpg' width='100' height='100' /></a>");
		pw.close();
	}

}
