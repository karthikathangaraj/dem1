package com.karthi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Demo33 extends HttpServlet{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		  res.setContentType("text/html");
		 PrintWriter out = res.getWriter(); 
		 out.println("<h1>" + "good afterNoon" + "</h1>"); 
		 out.println("<p>" + "Hello Friends!" + "</p>"); 
	}

}
