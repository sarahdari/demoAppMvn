package com.azienda;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//@WebServlet(
//name = "aggiungi",
//description = "This is my first annotated servlet",
//urlPatterns = "/add"
//)
@WebServlet ("/add")
public class AddServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i+j;
		
		PrintWriter out = response.getWriter();
		
	     out.println("result is " + k);
	     
//	     RequestDispatcher rd = request.getRequestDispatcher("sub");
//	     rd.forward(request, response);
	     
	     
	     
	}

}
