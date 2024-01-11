<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculation Result</title>
<style>
	body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.container {
    text-align: center;
    background-color: #ffffff;
    padding: 40px;
    border-radius: 15px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    transition: transform 0.3s ease;
}

h1 {
    color: #333;
    font-size: 2em;
}

.container:hover {
    transform: scale(1.05);
}
	
</style>
</head>
<body>
	<div class="container">
		<h1>Answer = <%=request.getParameter("res") %></h1>
	</div>
</body>
</html>
