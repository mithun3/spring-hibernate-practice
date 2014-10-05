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
		<c:forEach var="office" items="${company.offices}">
			<li><a href="${office.url}">${office.name}</a></li>
		</c:forEach>
	</ul>
	<a href="contacts">back to contact list</a> |
	<a href="office?add&company_id=${company.id}">Add Office</a> |
	<a href="${company.url}&edit">Edit company</a> | 
</body>
</html>