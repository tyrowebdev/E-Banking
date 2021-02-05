<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>About Us</title>
<style>
#head {
	text-align: center;
	font-size: 5vw;
}

#head:hover {
	color: #0033cc;
}

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
	left: 25%;
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

.main_content {
	padding: 10px;
}

.outer_box {
	border: 2px solid black;
	margin: 10px;
	padding: 10px;
}

.inner_box {
	background-color: #d6d6c2;
	padding: 20px;
}

.inner_box h3 {
	margin-bottom: 20px;
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
			<a class="navbar-brand" href="index.jsp"><img
				src="images/logo.png" width="150px" height="50px"></a>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0 pagination">
					<li class="page-item " aria-current="page"><a
						class="page-link" href="index.jsp">Home</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="login.jsp">Login</a></li>
					<li class="page-item  " aria-current="page"><a
						class="page-link" href="signup.jsp">SignUp</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="services.jsp">Services</a></li>
					<li class="page-item active" aria-current="page"><a
						class="page-link" href="aboutus.jsp">About Us</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<p id="head">About Us</p>
	<div class="main_content container">
		<div class="row">
			<div class="col-sm-12 col-md-12 col-lg-12 ">
				<div class="row outer_box">
					<div class="col-sm-12 col-md-12 col-lg-12 col-xl-6">
						<img src="images/bank.jpg" class="img-fluid">
					</div>
					<div class="col-sm-12 col-md-12 col-lg-12 col-xl-6 inner_box">
						<h3>What is E Banking?</h3>
						E banking allows a user to conduct financial transactions via the
						Internet. E banking is also known as Internet banking or web
						banking. E banking offers customers almost every service
						traditionally available through a local branch including deposits,
						transfers, and online bill payments. Virtually every banking
						institution has some form of online banking, available both on
						desktop versions and through mobile apps. With E Banking,consumers
						aren't required to visit a bank branch to complete most of their
						basic banking transactions. They can do all of this at their own
						convenience, wherever they want at home, at work, or on the go. E
						banking requires a computer or other device, an Internet
						connection, and a bank or debit card. In order to access the
						service, clients need to register for their bank's E banking
						service. In order to register, they need to create a password.
						Once that's done, they can use the service to do all their
						banking.
					</div>
				</div>
			</div>
			<div class="col-sm-12 col-lg-12 ">
				<div class="row outer_box">
					<div class="col-sm-12 col-md-12 col-lg-12 col-xl-6">
						<img src="images/network.jpg" class="img-fluid">
					</div>

					<div class="col-sm-12 col-md-12 col-lg-12 col-xl-6 inner_box">
						<h3>Why E Banking?</h3>
						E Banking operate exclusively online, with no physical branch.The
						banks handle customer service by phone, email, or online chat.
						Online banking is frequently performed on mobile devices now that
						Wi-Fi and 4G networks are widely available. It can also be done on
						a desktop computer. The bank may not provide direct automatic
						teller machine (ATM) access but will make provisions for consumers
						to use ATMs at other banks and retail stores. Reduced overhead
						costs associated with not having physical branches typically allow
						online banks to offer consumers significant savings on banking
						fees.Convenience is a major advantage of online banking. Basic
						banking transactions such as paying bills and transferring funds
						between accounts can easily be done 24 hours a day, seven days a
						week, wherever a consumer wishes. Online banking is fast and
						efficient. Funds can be transferred between accounts almost
						instantly, especially if the two accounts are held at the same
						institution.
					</div>
				</div>
			</div>
		</div>
	</div>


	<hr style="width: 50%; margin-left: 25%; height: 3px;">

	<footer class="footer">
		<div class="container">
			© 2021 MD.TOUSIF RAJJA . All Rights Reserved.<br> <a
				href="mailto:mtr7867@gmail.com">mtr7867@gmail.com</a>
		</div>
	</footer>

</body>
</html>