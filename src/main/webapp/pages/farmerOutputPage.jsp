<html>
<head>
<title>Farmer Page</title>
</head>
<body>
<h2>Farmer Loan Details</h2>
<jsp:include page="/nav"/>

<table width="50%">
<tr><td><strong>Field Area</strong></td><td>${frm.fieldArea}acres</td></tr>
<tr><td><strong>Crop Type</strong></td><td>${frm.cropType}</td></tr>
<tr><td><strong>old Loan</strong></td><td>${frm.oldLoan}</td></tr>
<tr><td><strong>Max Amount</strong></td><td>${frm.maxAmount}</td></tr>
<tr><td><strong>Eligible Loan Amount</strong></td><td>${frm.eligibleLoan}</td></tr>