<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Farm Form Page</title>
</head>
<body>
<h2>Farmer Loan Form</h2>
<jsp:include page="/nav">

<form:form method="POST" modelAttribute="form">

<div>
<form:label path="fieldArea">Field Area(in acres)</form:label>
<form:input type="number" path="fieldArea" required="required"/>
</div>

<div>
<form:label path="oldLoan">OldLoan</form:label>
<form:innput type="decimal" path="oldLoan" required="required"/>
</div>

<div>
<form:label path="cropType">CropType</form:label>
 <%-- <form:select path="cropType">
<form:option value="">-----SELECT-----</form:option>
<form:options items="${cropType} ">
</form:options>
</form:select>--%>
<form:radiobuttons path="cropType" items="${cropTypes }"/>
</div>


<div>
<button>Get Eligible Loan</button>
</div>
</form:form>
</body>
</html>
