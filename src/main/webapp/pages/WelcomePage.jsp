<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
	<head>
		<title>Welcome Page</title>
	</head>
	<body>
		<h2>Welcome Page</h2>
		<jsp:include page="/nav" />
		
		<form>
			<label>Enter name:
				<input type="text" name="unm" required/>
			</label>
			<button>OK</button>
		</form>
		
		<c:if test="${msg ne null }">			
			<h2>${msg }</h2>
		</c:if>
	</body>
</html>