<%@page import="com.tyrowebdev.E_Banking.DAO.UserManagementDAO"%>
<%@page import="com.tyrowebdev.E_Banking.model.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
	 response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
String role = (String) session.getAttribute("role");
if(role != null)
{
	if (role.equals("user")) {
		
		response.sendRedirect("unauthorizedPage.jsp");
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
<title>E Banking : Admin</title>
<style>
body {
	background-color: #f2f2f2;
	font-family: serif;
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
			<a class="navbar-brand" href="adminHome.jsp"><img
				src="images/logo.png" width="150px" height="50px"></a>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0 pagination">
					<li class="page-item " aria-current="page"><a
						class="page-link" href="adminHome.jsp">Main Menu</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="ViewAllServ">View Customers</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="addCustomer.jsp">Add Customer</a></li>
					<li class="page-item active" aria-current="page"><a
						class="page-link" href="searchCustomer.jsp">Search Customer</a></li>
					<li class="page-item " aria-current="page"><a
						class="page-link" href="LogoutServ">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	<div align="center" style="padding-top: 50px; margin-bottom: 50px;">
		<form action="searchCustomer.jsp" method="post">
			<label>Enter Account Number:</label> <input type="text" name="ac" size="25">
			<button style="background: #00ff00; padding: 10px;cursor: pointer;">Search</button>
		</form>
	</div>
		<div class="table-responsive container-fluid">
		<table class="table table-success table-striped">
			<thead>
				<tr>
					<th>Account Number</th>
					<th>Customer Name</th>
					<th>E-mail</th>
					<th>Address</th>
					<th>Contact</th>
					<th colspan="2">Actions</th>
				</tr>
			</thead>
			<%
				String ac = request.getParameter("ac");
			if (ac != null) {
				Users p = UserManagementDAO.selectAcRoleUser(ac);

				if (p != null) {
			%>
			<tr>
				<td><%=p.getAc()%></td>
				<td><%=p.getName()%></td>
				<td><%=p.getEmail()%></td>
				<td><%=p.getAddress()%></td>
				<td><%=p.getContact()%></td>
				<td><button style="background: #00ff00;"
						onclick="location.href = 'EditSupportServ?ac=<%=p.getAc()%>';">Edit</button></td>
				<td><button style="background: #00ff00;"
						onclick="location.href = 'DeleteServ?ac=<%=p.getAc()%>';">Delete</button></td>
			</tr>

			<%
				} else {
			%>
			<tr>
				<td colspan="5">No Record To Display</td>
			</tr>
			<%
				}
			} else {
			%>
			<tr>
				<td colspan="5">No Record To Display</td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
	
	
	<footer class="footer">
		<div class="container">
			© 2021 MD.TOUSIF RAJJA . All Rights Reserved.<br> <a
				href="mailto:mtr7867@gmail.com">mtr7867@gmail.com</a>
		</div>
	</footer>

</body>
</html>