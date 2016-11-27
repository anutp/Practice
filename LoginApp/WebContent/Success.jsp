<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "org.anutp.login.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>

 <h3> Login Successful !!!!</h3>

<br>

<h3>Hai <%=session.getAttribute("UserName") %> </h3> 

<br>

<form action  = "search" method = "post">
<input type = "submit"  value = "Search"> 
</form>
<br>
<form action = "logout" method = "post">

<input type = "submit" value = "Logout"/>

</form>

<br>

<%--<% User user = (User) session.getAttribute("userId"); %>

<h2> Hello <%=user.getUserId()%></h2> --%>

<br>

<%-- <% User user = (User) request.getAttribute("user"); %>

<h3> Hai <%=user.getUserId() %></h3> --%>

<%-- <jsp:useBean id="user" class="org.anutp.login.dto.User" scope = "request" >
	<jsp:setProperty property="userId" name="user" value="NewUser"/>
</jsp:useBean>

<h3>Hai <jsp:getProperty property="userId" name="user"/></h3> --%>
</body>
</html>