package com.azienda;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/lista")
public class ListaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<String> list = new ArrayList<>();
	    list.add("item1");
	    list.add("item2");
	    list.add("item3");
	    String json = new Gson().toJson(list);

	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	    
	
	}

}
