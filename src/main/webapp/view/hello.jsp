<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>contacts</title>
</head>
<body>
	<h1>Contacts</h1>
	<ul>
		<c:forEach var="contacts" items="${contacts}">
			<li><a href="???">${contacts.name}</a></li>
		</c:forEach>
	</ul>
</body>
</html>