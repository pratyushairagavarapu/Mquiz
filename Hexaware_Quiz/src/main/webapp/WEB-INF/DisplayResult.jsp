
<head>
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
</head>
<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
	<%@include file="Header.jsp"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hexa_Quiz</title>
</head>
<body>

	<div align="center" style="color: red;">
		<c:if test="${score ge 3}">
			<div class="card testimonial-card"
				style="align: centre; width: 500px;">
				<div class="card-up indigo lighten-1"></div>
				<div class="avatar mx-auto white" style="align: centre;">
					<img src="happy.jpg" class="rounded-circle"
						style="height: 200px; width: 200px">
				</div>
				<hr>
				<h2>Your Score is ${score} out of 5</h2>
				<h3 align="center">Congratulations You are Passed !!!</h3>
			</div>
		</c:if>


		<c:if test="${score lt 3}">
			<div class="card testimonial-card"
				style="align: centre; width: 500px;">
				<div class="card-up indigo lighten-1"></div>
				<div class="avatar mx-auto white" style="align: centre;">
					<img src="sad.jpg" class="rounded-circle"
						style="height: 200px; width: 200px">
				</div>
				<hr>
				<h2>Your Score is ${score} out of 5 </h2>
				<h3 align="center">You are Failed !!!</h3>
			</div>
		</c:if>
	</div>

	<footer>
		<div class="footer-copyright text-center py-3"
			style="background-color: 4285F4">
			© 2019 Copyright: <a href="https://hexaware.com"
				style="color: white;">Hexaware Technologies</a>
		</div>


	</footer>
</body>
</html>