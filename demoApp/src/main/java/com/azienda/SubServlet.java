package com.azienda;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet ("/sub")
public class SubServlet  extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));

		int k = i-j;

		PrintWriter out = response.getWriter();

		out.println("result is " + k);

		
		
	}
}
