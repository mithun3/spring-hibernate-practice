<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>contacts</title>
</head>
<body>
	<h1>Contacts</h1>
	<c:forEach var="contact" items="${contacts}">
		<c:out value="${contact.name}" />
	</c:forEach>
	<c:forEach var="contact2" items="${contacts2}">
		<c:out value="${contact2.name}" />
	</c:forEach>
</body>
</html>