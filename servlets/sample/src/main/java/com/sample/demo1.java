package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class demo1 extends HttpServlet {
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {    
	 res.setContentType("text/html");
	 PrintWriter out = res.getWriter(); 
	 out.println("<h1>" +" Good Night Team" + "</h1>"); 
	 out.println("<p>" + "Hello Friends!" + "</p>"); 
	 
    }

}
