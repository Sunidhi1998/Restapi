<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
	<head>
		<title>Arithmetic Page</title>
	</head>
	<body>
		<h2>Arithmetic Page</h2>
		<jsp:include page="/nav" />
		
		<form>
			<div>
				<label>Operand1: </label>
				<input type="number" name="op1" required/>
			</div>
			<div>
				<label>Operand2: </label>
				<input type="number" name="op2" required/>
			</div>
			<button name="operation" value="sum">ADD</button>
			<button name="operation" value="dif">SUBSTRACT</button>
			<button name="operation" value="prd">MULTIPLY</button>
			<button name="operation" value="qut">DIVIDE</button>
			<button name="operation" value="rem">MODULO</button>
			
		</form>
		
		<hr />
		
		<form>
			<div>
				<label>Operand1: </label>
				<input type="number" name="op1" required/>
			</div>
			<div>
				<label>Operand2: </label>
				<input type="number" name="op2" required/>
			</div>
			<div>
				<label>Operation</label>
				<select name="operation">
					<option value="sum">ADDITION</option>
					<option value="dif">SUBSTRACTION</option>
					<option value="prd">MULTIPLICATION</option>
					<option value="qut">DIVISION</option>
					<option value="rem">MODULO</option>
				</select>
			</div>
			<button>Compute</button>
			
		</form>

		
		<c:if test="${result ne null }">			
			<h2>${result }</h2>
		</c:if>
	</body>
</html>