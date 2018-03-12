package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet 
{

	private List<Date> visits = new ArrayList<Date>();
	
	public void service (HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		synchronized(this) {
		visits.add(new Date());
		}
		out.println ("<html><body><h1>Hello World!</h1>");
		out.println ("</body></html>");
		out.close();
	}
}

