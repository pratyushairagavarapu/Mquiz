
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
<style>
</style>
</head><%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
	<%@include file="Header.jsp"%>

	<article>
		<h2>Quiz History</h2>



		<c:if test="${hist ne null}">


			<table>
				<thead>
					<tr>
					
						<th>Date</th>
						<th>Exam Name</th>
						<th>Score</th>
						<!--  <th></th>
        <th></th> -->
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${requestScope.hist}" var="emp">
						<tr>
							
							<td>${emp.eDate}</td>
							<td>${emp.exam.getExamName()}</td>
							<td>${emp.score}</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>

		</c:if>


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