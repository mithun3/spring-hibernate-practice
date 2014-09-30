<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>view contacts</title>
</head>
<body>
	<h1>View Contacts</h1>
	<input type="hidden" name="add">
	<h2>${contact.name}</h2>
	<ul>
		<li>${address.street}</li>
		<li>${address.state} - ${address.zip}</li>
	</ul>
	<a href="contacts">back to contact list</a> | <a href="contact?edit&id=${contact.id}">Edit contact</a> | <a href="contact?delete&id=${contact.id}">Delete contact</a>
</body>
</html>