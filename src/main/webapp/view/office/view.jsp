<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>view offices</title>
</head>
<body>
	<h1>View office</h1>
	<input type="hidden" name="add">
	<h2>${office.name}</h2>
	<ul>
		<c:set var="address" value="${office.address}"/>
		<li>${address.street}</li>
		<li>${address.state} - ${address.zip}</li>
	</ul>
	<a href="contacts">back to contact list</a> |
	<a href="${office.url}&edit">Edit office</a> | 
</body>
</html>