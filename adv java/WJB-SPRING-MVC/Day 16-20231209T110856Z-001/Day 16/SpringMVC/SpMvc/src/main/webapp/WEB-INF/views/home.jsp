<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
 
   <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "Hello "+request.getAttribute("city")%>
<% 
List<String> ms=(List<String>)request.getAttribute("studs");
for(String s:ms){
	
	out.println(s);
} 
%>
${city}
</body>
</html>