<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<form action ="employee/store" method="get">
<label for="userId">UserId</label>
<input type="text" id="userId" name="userId" required autofocus /> 
<label for="userName">UserName</label>
<input type="text" id="userName" name="userName" required> 
<br><input type="submit" value="store" name="action"><br>

</form>
</body>
</html>