<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users Shipping Details</title>
</head>
<body>
<h1>Users Shipping Details</h1>
<form:form method="post" modelAttribute='product' commandName="product">
<form:label path="name">${product.name }</form:label>
<form:input path="name"></form:input>

<%-- <form:label path="address">Shipping Address</form:label>
<form:input path="address"></form:input>

<form:label path="address">Contact No.</form:label>
<form:input path="address"></form:input>

<form:label path="address">Zip Code</form:label>
<form:input path="address"></form:input> --%>

</form:form>

</body>
</html>