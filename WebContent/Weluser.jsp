<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cherry.model.Login"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome</h1><br>
<%
String name = com.cherry.controller.LoginController.Get();
out.println(name);
%>
<h1>enter appointment details <a href='/Patient_register_app/Patdetails.html'> here</a>
</h1>
</body>
</html>