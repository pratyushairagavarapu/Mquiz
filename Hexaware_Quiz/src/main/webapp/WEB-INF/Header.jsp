<header>
	<h1>Hexaware Quiz</h1>
	<div align="right" style="width: 80%">
		<span style="color: yellow; margin-right: 20px">${initParam.slogan}</span>
		<c:if test="${sessionScope.login ne null}">
			<p style="color: white; padding-right: 20px" class="uppercase">
				Hi ${sessionScope.login.userName}</p>
			<a href="returnhome" style="color: white; padding-right: 20px">HOME</a>

			<a href="logout" style="color: white">Signout</a>
		</c:if>
		<c:if test="${sessionScope.login eq null}">
			<a href="home" style="color: white;">SignIn</a>
		</c:if>
	</div>
</header>