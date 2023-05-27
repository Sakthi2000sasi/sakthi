<%@page import="dto.studentdto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<studentdto> li=(List<studentdto>)request.getAttribute("student");%>
<table border="	">
<tr>
<th>id</th>
<th>gender</th>
<th>phno</th>
<th>name</th>
<th>Delete</th>
<th>Update</th>
</tr>
<% for(studentdto a:li) {%>
<tr>
<td><%=a.getSid() %></td>
<td><%=a.getGender() %></td>
<td><%=a.getPhone_no()%></td>
<td><%=a.getSname() %></td>
<td><a href="delete?id=<%=a.getSid()%>">delete</a>
<td><a href="update.jsp?
id=<%=a.getSid()%>
&name=<%=a.getSname()%>
&phone=<%=a.getPhone_no()%>
&gender=<%=a.getGender()%>">submit</a>

</tr>
<%} %>
</table>
</body>
</html>