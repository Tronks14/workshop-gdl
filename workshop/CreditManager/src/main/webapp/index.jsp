<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Example Program</title>
	</head>
	<body>
	<h1>Q onda!!!</h1>
	<p>Now, you can search for a book</p>
<s:form action="books">
	<s:textfield name="bookQuery" label="Writhe a book name here:"/>
	<s:submit value="submit"/>
</s:form>

</body>
</html>