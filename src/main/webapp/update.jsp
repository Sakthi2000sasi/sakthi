<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="pragiee1">
id:<input type="number" name="id" value=<%=request.getParameter("id") %> readonly="readonly"><br><br>
name:<input type="text" name="name" value=<%=request.getParameter("name") %>><br><br>
phone:<input type="number" name="phone" value=<%=request.getParameter("phone") %>><br><br>
<% if(request.getParameter("gender").equals("male")){ %>
male:<input type="radio" name="gender" value="male" checked="checked">
female:<input type="radio" name="gender" value="female">
<%} else{ %>
male:<input type="radio" name="gender" value="male">
female:<input type="radio" name="gender" value="female"><br><br>
<%} %>
<button type="submit">submit</button>
</form>
</body>
</html>