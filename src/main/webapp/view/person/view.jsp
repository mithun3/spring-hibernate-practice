<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>view persons</title>
</head>
<body>
	<h1>View persons</h1>
	<input type="hidden" name="add">
	<h2>${person.name}</h2>
	<ul>
		<c:set var="address" value="${person.address}"/>
		<li>${address.street}</li>
		<li>${address.state} - ${address.zip}</li>
	</ul>
	<a href="contacts">back to contact list</a> |
	<a href="person?edit&id=${person.id}">Edit person</a> | 
</body>
</html>