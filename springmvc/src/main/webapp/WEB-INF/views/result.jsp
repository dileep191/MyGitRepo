<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
        String name = (String) request.getAttribute("name");
    	String email = (String)request.getAttribute("email");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
	WELCOME
		<%
		if(name!="" && name!=null){
		%>
			<%=name %>
			<%
			}
			%>

</h1>
<h2>Submitted Details Are</h2>
<h3>
<%
if(email!="" && email!=null){
%>
<%=email %>
<%
}
%>
</h3>
</body>
</html>