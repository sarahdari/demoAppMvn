<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>	
	$.(document).on("click", "#bottone", function()) { // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
		$.get("lista", function(responseJson) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response JSON...
			var $ul = $("<ul>").appendTo($("#div")); // Create HTML <ul> element and append it to HTML DOM element with ID "somediv".
			$.each(responseJson, function(index, item) { // Iterate over the JSON array.
				$("<li>").text(item).appendTo($ul); // Create HTML <li> element, set its text content with currently iterated item and append it to the <ul>.
			});
		});
	});	
	
</script>
</head>
<body>

</body>
</html>