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
<title>Services</title>
<style>
body {
	background-color: #f2f2f2;
	font-family: serif;
}

#head {
	text-align: center;
	font-size: 5vw;
}

#head:hover {
	color: #0033cc;
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

.para {
	background-color: #d6d6c2;
}

.main_content  .row .card{
	padding: 10px;
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
					<li class="page-item " aria-current="page"><a
						class="page-link" href="signup.jsp">SignUp</a></li>
					<li class="page-item active" aria-current="page"><a
						class="page-link" href="services.jsp">Services</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="aboutus.jsp">About Us</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<p id="head">Featured Services</p>

	<div class="main_content container">
		<div class="row">
			<div class="card col-sm-12 col-md-6 col-lg-4">
				<img src="images/anytime.jpg" class="card-img-top">
				<div class="card-body">
					<p class="card-text ">
						<b>Anytime Anywhere Benefit:</b> One of the biggest benefits of
						online banking is its round-the-clock access. The 24x7 anytime and
						anywhere access means that you can manage your transactions easily
						from the comfort of your office or home. The time saved could help
						improve productivity by allowing you to spend it on other
						essential business activities.
					</p>
				</div>
			</div>
			<div class="card col-sm-12 col-md-6 col-lg-4">
				<img src="images/tracking.jpg" class="card-img-top">
				<div class="card-body">
					<p class="card-text ">
						<b>Tracking Transactions:</b> You can use the E Banking portal of
						your bank to easily access all your past banking activities such
						as transfers, deposits, cleared cheques and more. No matter if the
						transaction was done last week, last month or last year, you can
						quickly go through the entire history with only a few clicks.
					</p>
				</div>
			</div>
			<div class="card col-sm-12 col-md-6 col-lg-4">
				<img src="images/fraud.jpg" class="card-img-top">
				<div class="card-body">
					<p class="card-text ">
						<b>Reduced Fraud And Higher Scrutiny: </b>The level of visibility
						that Internet Banking offers into your financial transactions also
						helps prevent frauds. The online banking portal functions as a
						single-window for all the transactions done by you, your managers
						and people from the accounting staff. This can help you make sure
						that you are always fully aware of all the transactions.
					</p>
				</div>
			</div>
			<div class="card col-sm-12 col-md-6 col-lg-4">
				<img src="images/mbank.jpg" class="card-img-top">
				<div class="card-body">
					<p class="card-text ">
						<b>Mobile Banking:</b> Apart from the digital banking portal on
						the web, you can also do online transactions through mobile
						phones. Many of the banks now have their mobile apps or exclusive
						online portals that can be accessed from mobile phones. So, even
						if you do not have access to a laptop or computer, you can still
						manage all of your financial transactions through your mobile
						phone.
					</p>
				</div>
			</div>
			<div class="card col-sm-12 col-md-6 col-lg-4">
				<img src="images/transfer.jpg" class="card-img-top">
				<div class="card-body">
					<p class="card-text ">
						<b>Instant Money Transfer:</b> With online banking, you get access
						to a range of money transfer services such as Real-Time Gross
						Settlement (RTGS), Immediate Payment Service (IMPS) and National
						Electronic Funds Transfer (NEFT). From transferring funds to
						making payments to vendors, you can now do it instantly within
						seconds.
					</p>
				</div>
			</div>
			<div class="card col-sm-12 col-md-6 col-lg-4">
				<img src="images/secure.jpg" class="card-img-top">
				<div class="card-body">
					<p class="card-text ">
						<b>Complete Security</b> Compared to cash transactions, online
						banking is more secure. Since the transfers are handled digitally
						in online banking, there is no risk of theft and burglary, which
						is quite a common issue for businesses dealing in cash
						transactions. Moreover, the risk of human error is also reduced
						significantly in online banking. Be it you or your staff, handling
						large amounts of cash is always risky. With small business online
						banking, these risks can be effectively prevented.
					</p>
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