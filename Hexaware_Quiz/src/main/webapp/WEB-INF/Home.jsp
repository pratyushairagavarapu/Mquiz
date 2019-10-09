
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
<style>


p.uppercase {
	text-transform: uppercase;
}
</style>
<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
	<%@include file="Header.jsp"%>
	<article>

		<nav style="padding-top: 50px">
			<div class="card testimonial-card"
				style="align: centre; width: 500px;">

				<!-- Background color -->
				<div class="card-up indigo lighten-1"></div>

				<!-- Avatar -->
				<div class="avatar mx-auto white" style="align: centre;">
					<img src="logo.jpg" class="rounded-circle"
						style="height: 200px; width: 200px; border-style: solid; border-color: #0000ff;">
				</div>

				<!-- Content -->
				<div class="card-body" style="padding-left: 32%">
					<!-- Name -->
					<h4>
						<p class="uppercase">WELCOME ${sessionScope.login.userName}</p>
					</h4>
				</div>
				<hr>
				<div style="align: centre; padding-left: 27%">
					<a href="schedule"><div>Show Schedule</div></a> <a href="history"><div>View
							History</div></a>
				</div>


			</div>
			<!-- <div align="center" style="padding-left: 30%">
 
   <a href="schedule" align="center" ><div>Show Schedule</div></a>
      <a href="history" align="center"><div>View History</div></a>
   </div> -->
		</nav>
		<%-- <div style="text-align:center">
    ${msg}
</div> --%>
	</article>
	<footer>
		<div class="footer-copyright text-center py-3"
			style="background-color: 4285F4">
			© 2019 Copyright: <a href="https://hexaware.com"
				style="color: white;">Hexaware Technologies</a>
		</div>


	</footer>
</body>
</html>