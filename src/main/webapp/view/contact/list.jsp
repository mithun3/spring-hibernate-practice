<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>contacts</title>
</head>
<body>
	<h1>Contacts</h1>
	<ul>
		<c:forEach var="contact" items="${contacts}">
			<li><a href="person?id=${contact.id}"><c:out value="${contact.name}" /></a></li>
		</c:forEach>
	</ul>

	<a href="person?add">add contact</a>
</body>
</html>