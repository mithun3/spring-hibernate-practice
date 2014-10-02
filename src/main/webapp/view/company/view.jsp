<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>view company</title>
</head>
<body>
	<h1>View company</h1>
	<input type="hidden" name="add">
	<h2>${company.name}</h2>
	<ul>
	</ul>
	<a href="contacts">back to contact list</a> |
	<a href="${company.url}&edit">Edit company</a> | 
</body>
</html>