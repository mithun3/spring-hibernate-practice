<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Hello</title>
</head>
<body>
<h1>Hello ${name}! From JSP</h1>
<c:forEach var="names" items="${names}">
	<h1>hello ${names }</h1>
</c:forEach>
</body>
</html>