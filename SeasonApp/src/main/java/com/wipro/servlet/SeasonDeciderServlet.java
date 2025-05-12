package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeasonDeciderServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest hreq, HttpServletResponse hres) throws ServletException, IOException {

		// set response content type
		hres.setContentType("text/html");

		// get-PrintWriter
		PrintWriter pw = hres.getWriter();

		// get System Date
		LocalDate ld = LocalDate.now();

		// get current month
		int month = ld.getMonthValue();

		if (month >= 3 && month <= 6) {
			pw.println("<h1 style=color:red;text-align:center'>Season Name::Summer Season</h1>");
		}
		if (month >= 7 && month <= 10) {
			pw.println("<h1 style=color:red;text-align:center'>Season Name::Rainy Season</h1>");
		} else {
			pw.println("<h1 style=color:red;text-align:center'>Season Name::Winter Season</h1>");
		}

		// add home hyperlink
		pw.println("<br><br><a href='http://localhost:8080/SeasonApp/page.html'>Home</a>");
		
		pw.close();
	}// end of Service method

}// end of class
