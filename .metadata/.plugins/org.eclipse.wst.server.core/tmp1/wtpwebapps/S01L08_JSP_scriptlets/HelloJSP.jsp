<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<h1>Hello JSP</h1>

<% out.println("Hello World!"); %>
<br />

<%-- if-else-condition in JSP --%>
<%
int x = 25;

if (x > 25) {
	out.println("X is greater than 25");
} else {
	out.println("X is less or equal 25");
}
%>
<br />

<%= x %>
<br />

<%-- Loops in JSP --%>
<%
for (int i = 0; i < 10; i++)
	out.print(i + 1 + ". Output<br/>");
%>

</body>
</html>