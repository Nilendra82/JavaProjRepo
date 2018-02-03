package com.request.ticket;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProcessRequestTicketId")
public class ProcessRequestTicketId extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Random random = new Random();
		String name = request.getParameter("name");
		String issueType = request.getParameter("issueType");
		String contactType = request.getParameter("primaryContact");
		int refNo = random.nextInt(1000000);
		PrintWriter out = response.getWriter();
		out.print("Thank you for submitting your request");
		out.print("Reference Number: "+refNo);
		out.print("Name: "+name);
		out.print("Issue: "+issueType);
		out.print("Contact Type: "+contactType);
		out.print("Our support engineer will get back to you");
	}
}
