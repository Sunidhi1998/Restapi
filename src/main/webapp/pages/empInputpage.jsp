<html>
	<head>
		<title>Employee Form Page</title>
	</head>
	<body>
		<h2>Employee Form</h2>
		<jsp:include page="/nav" />
		
		<form method="POST">
			<label>Enter Name:
				<input type="text" name="name" required/>
			</label>
			<label>Enter Basic:
				<input type="decimal" name="basic" required/>
			</label>
			<button>Submit</button>
		</form>
		
	</body>
</html>