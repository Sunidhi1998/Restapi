<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
	<head>
		<title>Contact Page</title>
	</head>
	<body>
	<h1>Contact Us Page</h1>
	<jsp:include page="/nav" />
	
	<h2>Please write to us at: <strong>${mailId }</strong></h2>
	
	<h2>You can call us at: </h2>
	<ol>
		<c:forEach var="m" items="${mobiles }">
		 <li>${m }</li>
		</c:forEach>
	</ol>
	
	</body>
</html>