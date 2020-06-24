<html>
	<head>
		<title>Employee Page</title>
	</head>
	<body>
		<h2>Employee Details</h2>
		<jsp:include page="/nav" />
		
		<table width="50%">
			<tr><td><strong>Name</strong></td><td>${emp.name }</td></tr>
			<tr><td><strong>Basic</strong></td><td>${emp.basic }</td></tr>
			<tr><td><strong>TA</strong></td><td>${emp.ta }</td></tr>
			<tr><td><strong>HRA</strong></td><td>${emp.hra }</td></tr>
			<tr><td><strong>Total Pay</strong></td><td>${emp.ta + emp.hra }</td></tr>
		</table>
	</body>
</html>