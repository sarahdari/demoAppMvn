<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add jsp</title>
</head>
<body bgcolor = "#fff" >
<% 

int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i+j;
		
		out.println("Il risultato è: " + k);
		
		%>

</body>
</html>