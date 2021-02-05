<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
	 response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
String role = (String) session.getAttribute("role");
if(role != null)
{
	if (role.equals("admin")) {
		
		response.sendRedirect("unauthorizedUserPage.jsp");
	}
} else {
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="shortcut icon" type="image/x-icon" href="images/logo.png">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
	crossorigin="anonymous"></script>
<title>E Banking</title>
<style>
body {
	background-color: #f2f2f2;
	font-family: serif;
}

.footer {
	background-color: #f2f2f2;
	color: #000000;
	text-align: center;
}

.footer a {
	text-decoration: none;
	color: #000000;
}

.footer .container {
	padding: 30px;
	margin-bottom: 0;
	font-size: 20px;
}

#csvbutton{
padding: 10px;
display: flex;
justify-content: center;
}

#csvbutton a{
text-decoration: none;
color: white;
background: black;
padding: 0 20px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light"
		style="background-color: #f2f2f2; padding: 15px;">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="customerHome.jsp"><img
				src="images/logo.png" width="150px" height="50px"></a>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0 pagination">
					<li class="page-item " aria-current="page"><a
						class="page-link" href="customerHome.jsp">Main Menu</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link " href="ViewDetailServ">View Details</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="UserBalanceServ1">Deposit Money</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="EmailFinderServ">Withdraw Money</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="EmailFinderServTransfer">Transfer Money</a></li>
					<li class="page-item active" aria-current="page"><a
						class="page-link" href="TransactionServ">Transaction Details</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="LogoutServ">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>

<div class="main_body">
	<div class="table-responsive container ">
			<table class="table table-success table-striped">
				<tr>
					<th>Your Account Number</th>
					<th>Transaction From/To</th>
					<th>Type</th>
					<th>Amount</th>
					<th>Balance</th>
					<th>Date And Time</th>
				</tr>
				<c:forEach var="trans" items="${transactionList}">
					<tr>
						<td><c:out value="${trans.ac}"></c:out></td>
						<td><c:out value="${trans.from}"></c:out></td>
						<td><c:out value="${trans.type}"></c:out></td>
						<td><c:out value="${trans.amount}"></c:out></td>
						<td><c:out value="${trans.balance}"></c:out></td>
						<td><c:out value="${trans.date_time}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
			<div id="csvbutton"><a href="JdbcCsvFile">Download</a></div>
			</div>
	</div>

	<footer class="footer">
		<div class="container">
			© 2021 MD.TOUSIF RAJJA . All Rights Reserved.<br> <a
				href="mailto:mtr7867@gmail.com">mtr7867@gmail.com</a>
		</div>
	</footer>

</body>
</html>