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
<title>Verify</title>
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
	
}

.login_form input {
	display: flex;
	text-align: center;
	border:none;
	outline:none;
	margin: 20px auto;
}

.login_form #submit {
	background: #0066cc;
	color: white;
	padding: 0 20px;
}

.main_body {
	background: url("images/homePage.jpg") no-repeat;
	background-position:center center;
	background-size: cover;
	padding: 100px;
}

.login_form h1{
background-color: black;
color: white;
border:2px solid black;
border-radius: 10px;
}
</style>
</head>
<body>

	<div class="main_body">
		<div class="login_form container" align="center">
			<form action="OTPCheckerServ" method="post">
				<h1>Enter OTP received on email</h1>
				<p style="background-color: blue;color: white;">Enter OTP </p>
				<input type="text" placeholder="OTP" name="otpe" required="required"> 
				<input type="submit" value="Verify" id="submit">
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