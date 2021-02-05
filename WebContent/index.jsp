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
	left: 25%;
}

.blinking{
    animation:blinkingText 2s infinite;
    background-color: black;
    border-radius: 30px;
}
@keyframes blinkingText{
    0%{     color: white;    }
    49%{    color: blue; }
    60%{    color: red; }
    99%{    color:gold;  }
    100%{   color: white;    }
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
     background-color:#f2f2f2 ;
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
					<li class="page-item active" aria-current="page"><a
						class="page-link" href="index.jsp">Home</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="login.jsp">Login</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="signup.jsp">SignUp</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="services.jsp">Services</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="aboutus.jsp">About Us</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="main_body">
		<img src="images/homePage.jpg" class="img-fluid">
		<div class="welcomequote">
			<q style="font-size: 5vw;" class="blinking">Welcome To E Banking !</q>
		</div>
	</div>

	<div align="center" id="benefits">
		<h3 style="font-size: 5vw"  class="blinking">Benefits Of Using E Banking</h3>
	</div>

	<div class="container">
		<div class="row">
			<div class=" col-sm-6 col-lg-4 boxes">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Access Your Account 24/7</h4>
						<p class="card-text">No need to go anywhere or stand in any
							line or wait for hours ,banking from home or anywhere.</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-lg-4 boxes">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Check Balances</h4>
						<p class="card-text">You can check your balance anytime from
							anywhere ,you just have to login your account and check,thats it
							!</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-lg-4 boxes">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Transfer Funds</h4>
						<p class="card-text">Transfer money between accounts using E
							Banking anytime anywhere.You just have to enter the details of
							the receiver .</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-lg-4 boxes">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Download Statements</h4>
						<p class="card-text">Download or print statements for your tax
							or personal records.You can again download them later if lost.</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-lg-4 boxes">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Deposit Money</h4>
						<p class="card-text">You can add money to your account from
							anywhere anytime, no need of worrying for bank to be open.</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-lg-4 boxes">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Security</h4>
						<p class="card-text">E Banking has OTP security function which
							sends an OTP to your registered email before every transaction .</p>
					</div>
				</div>
			</div>
		</div>
	</div>

<hr style="width: 50%;margin-left: 25%; height: 3px;">

	<footer class="footer">
		<div class="container">
			© 2021 MD.TOUSIF RAJJA . All Rights Reserved.<br> <a
				href="mailto:mtr7867@gmail.com">mtr7867@gmail.com</a>
		</div>
	</footer>

</body>
</html>