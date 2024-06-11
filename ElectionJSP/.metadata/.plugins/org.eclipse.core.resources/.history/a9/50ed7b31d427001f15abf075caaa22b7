<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
		<jsp:useBean id="lb" class="com.election.beans.RegistartionBin"/>
		<jsp:setProperty property="firstName" name="lb" param="firstName"/>
		<jsp:setProperty property="lastName" name="lb" param="lastName"/>
		<jsp:setProperty property="email" name="lb" param="email"/>
		<jsp:setProperty property="password" name="lb" param="password"/>
		<jsp:setProperty property="date" name="lb" param="date"/>
		<jsp:setProperty property="	status" name="lb" param="status"/>
		<jsp:setProperty property="role" name="lb" param="role"/>
		<% lb.authenticate(); %>
		<% if(lb.getUser() != null) {%>
			Registration Successfull 
			 <jsp:forward page="index.jsp"></jsp:forward>
		<% } else { %>
			Registration Failed 
		<% } %>
</body>
</html>