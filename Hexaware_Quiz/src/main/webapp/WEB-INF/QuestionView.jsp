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
body {
	background: url(bgg.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style>
</head>
<%@include file="Meta.jsp"%>
<html>
<head>
<%@include file="HeadSection.jsp"%>
<body>

	<%@include file="Header.jsp"%>
	<article>
		<h2 style="color: white; text-shadow: 2px 2px #ff0000;">
			<b>JAVA QUIZ</b>
		</h2>
		<hr>
		<section id="ques">

			<form action="quiz" method="post">
				<div>${ques.quesName}</div>
				<%-- <div><input type="radio" name="ques" value="${ques.optA}">${ques.optA}</div>
<div><input type="radio" name="ques" value="${ques.optB}">${ques.optB}</div>
<div><input type="radio" name="ques" value="${ques.optC}">${ques.optC}</div>
<div><input type="radio" name="ques" value="${ques.optD}">${ques.optD}</div>
 --%>
				<c:choose>
					<c:when
						test="${ques.optA eq sessionScope.amap[requestScope.ques.quesId]}">
						<div>
							<input type="radio" name="ques" value="${ques.optA}" checked>${ques.optA}</div>

					</c:when>
					<c:otherwise>
						<div>
							<input type="radio" name="ques" value="${ques.optA}">${ques.optA}</div>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when
						test="${ques.optB eq sessionScope.amap[requestScope.ques.quesId]}">
						<div>
							<input type="radio" name="ques" value="${ques.optB}" checked>${ques.optB}</div>

					</c:when>
					<c:otherwise>
						<div>
							<input type="radio" name="ques" value="${ques.optB}">${ques.optB}</div>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when
						test="${ques.optC eq sessionScope.amap[requestScope.ques.quesId]}">
						<div>
							<input type="radio" name="ques" value="${ques.optC}" checked>${ques.optC}</div>

					</c:when>
					<c:otherwise>
						<div>
							<input type="radio" name="ques" value="${ques.optC}">${ques.optC}</div>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when
						test="${ques.optD eq sessionScope.amap[requestScope.ques.quesId]}">
						<div>
							<input type="radio" name="ques" value="${ques.optD}" checked>${ques.optD}</div>

					</c:when>
					<c:otherwise>
						<div>
							<input type="radio" name="ques" value="${ques.optD}">${ques.optD}</div>
					</c:otherwise>
				</c:choose>


				<input type="hidden" name="qid" value="${ques.quesId}" />
				<hr />
				<div align="center">
					<c:if test="${sessionScope.qindex gt 0 }">

						<input type="submit" value="prev" name="btn"
							class="btn btn-primary" />
					</c:if>
					<c:if test="${sessionScope.qindex lt 4 }">
						<input type="submit" value="next" name="btn"
							class="btn btn-primary" />
					</c:if>
					<c:if test="${sessionScope.qindex eq 4 }">
						<input type="submit" value="finish" name="btn"
							class="btn btn-primary" />
						<!--   <a href="showresult" name="btn">Finish</a> -->
					</c:if>





				</div>
			</form>
		</section>
	</article>

</body>
</html>