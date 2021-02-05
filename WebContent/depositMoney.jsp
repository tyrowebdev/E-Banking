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

.main_body {
	position: relative;
}

.welcomequote {
	position: absolute;
	top: 3%;
	left: 20%;
}

.welcomequote q:hover {
	color: #0033cc;
}

#benefits {
	margin: 15px 0;
}

#benefits h3:hover {
	color: #0033cc;
}

.container {
	margin-bottom: 30px;
}

.container .row .boxes {
	padding: 10px;
	cursor: pointer;
	transition: transform 1s;
}

.container .row .boxes:hover {
	transform: translateY(-10px);
	box-shadow: 20px 20px 20px gray;
}

.container .row .boxes .card-title {
	text-align: center;
}

.container .row .boxes:hover .card-title {
	color: white;
	background-color: black;
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

.login_form {
	border: 2px solid black;
	text-align: center;
	padding: 30px;
	width: 300px;
	border-radius: 10px;
	box-shadow: 7px 7px 60px black;
	background-color: #999966;
}

.login_form input {
	display: flex;
	text-align: center;
	border: none;
	outline: none;
	margin: 20px auto;
}

.login_form #submit {
	background: #0066cc;
	color: white;
	padding: 0 20px;
}

.main_body {
	background: url("images/homePage.jpg") no-repeat;
	background-position: center center;
	background-size: cover;
	padding: 100px;
}

.login_form h1 {
	background-color: black;
	color: white;
	border: 2px solid black;
	border-radius: 10px;
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
			<a class="navbar-brand" href="adminHome.jsp"><img
				src="images/logo.png" width="150px" height="50px"></a>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0 pagination">
					<li class="page-item " aria-current="page"><a
						class="page-link" href="customerHome.jsp">Main Menu</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link " href="ViewDetailServ">View Details</a></li>
					<li class="page-item active " aria-current="page"><a
						class="page-link" href="UserBalanceServ1">Deposit Money</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="EmailFinderServ">Withdraw Money</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="EmailFinderServTransfer">Transfer Money</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="TransactionServ">Transaction Details</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="LogoutServ">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="main_body">
		<div class="login_form container" align="center">
			<form action="DepositServ" method="post">
				<h1>Deposit Money</h1>
				<div style="border: 2px white solid; margin-bottom: 5px;">Current Balance<input type="text" placeholder="0.00" value="${bal.balance}" name ="old_bal"  readonly="readonly"></div>
				<div style="border: 2px white solid;">Account Number<input type="text" placeholder="Account Number" name="ac" value="${user.ac}"  readonly="readonly"></div>
				<input type="text" placeholder="Amount" name="new_amount" required="required">
				<input type="submit" value="Deposit" id="submit">
			</form>
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