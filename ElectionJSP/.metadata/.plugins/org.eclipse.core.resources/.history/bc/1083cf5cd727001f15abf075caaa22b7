<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Beans</title>
</head>
<body>
		<jsp:useBean id="lb" class="com.election.beans.LoginBin"/>
		<jsp:setProperty property="email" name="lb" param="email"/>
		<jsp:setProperty property="	password" name="lb" param="password"/>
		<% lb.authenticate(); %>
		<% if(lb.getUser() != null) {%>
			Welcome , <jsp:getProperty property="email" name="lb"/>
			<jsp:forward page="candidateList.jsp"></jsp:forward>
		<% } else { %>
			Login Failed 
			<% } %>
</body>
</html>