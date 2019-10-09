<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Hexa_Quiz</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>HexaQuiz</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link href="bootstrap-material-design-master/css/bootstrap.min.css"
	rel="stylesheet">

<link href="bootstrap-material-design-master/css/mdb.min.css"
	rel="stylesheet">

<link href="bootstrap-material-design-master/css/style.css"
	rel="stylesheet">
<link href="bootstrap-material-design-master/css/compiled.min.css"
	rel="stylesheet">
<style>
.navbar {
	overflow: hidden;
	background-color: #333;
	position: fixed;
	top: 0;
	width: 100%;
}

.navbar a {
	float: left;
	display: block;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.navbar a:hover {
	background: #ddd;
	color: black;
}

#footer {
	position: fixed;
	bottom: 0px;
	width: 100%;
	height: 100px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark primary-color">
		<a class="navbar-brand" href="#"><img src="logo.jpg"
			style="border-radius: 50%; height 50px; width: 30px"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div style="width: 100%; padding-left: 30%;">
			<b>YOUR SUCCESS IS OUR FOCUS</b>
			<image src="Quiz.jpg" style="height: 65px;border-radius: 30%;"></image>
			<b>LET'S TEST YOUR KNOWLEDGE</b>

		</div>

	</nav>


	<div style="padding-top: 81px; width: 100%">
		<div style="width: 30%; float: left; height: 600px;">
			<div class="card" style="height: 500px;">

				<h5 class="card-header danger-color white-text text-center py-4">
					<strong>Sign in</strong>
				</h5>

				<!--Card content-->
				<div class="card-body px-lg-5 pt-0">

					<!-- Form -->
					<form class="text-center" style="color: darkred;"
						action="displaypage" method="post">

						<!-- Email -->
						<div class="md-form">
							<input type="number" id="materialLoginFormEmail" name="userId"
								class="form-control" placeholder="USER ID"required">

						</div>
						<br>
						<!-- Password -->
						<div class="md-form">
							<input type="password" id="materialLoginFormPassword"
								name="userPassword" class="form-control" placeholder="PASSWORD"
								required="required">

						</div>
						<br>
						<div class="d-flex justify-content-around">
							<div>
								
							</div>

						</div>

						<!-- Sign in button -->
						<button
							class="btn btn-outline-danger btn-rounded btn-block my-4 waves-effect z-depth-0"
							type="submit">Sign in</button>
						<div align="center" style="color: red;">
							<c:if test="${message ne null}">
								<h3 align="center">${message}</h3>
							</c:if>
						</div>
					</form>
					<!-- Form -->

				</div>

			</div>

		</div>
		<div style="width: 70%; float: left; height: 500px;">
			<img src="DEWviX7XkAEXOEw.jpg" style="width: 100%; height: 100%;">
		</div>
	</div>



	<footer style="background-color: 4285F4">
		<div class="footer-copyright text-center py-3"
			style="background-color: 4285F4">
			© 2019 Copyright: <a href="https://hexaware.com"
				style="color: white;">Hexaware Technologies</a>
	</footer>
	</div>
</body>
</html>