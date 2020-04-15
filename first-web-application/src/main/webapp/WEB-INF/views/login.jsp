<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<form action="/login.do" method="post">
<p class="alert-danger">${errorMessage}</p>
<p class="alert-success">${signedUp}</p>

 Your name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="name"/><br><br>
 you password&nbsp;&nbsp;&nbsp;<input type="password" name="password"/><br><br>
  <input class="btn btn-success" type="submit" value="Sign in"/> 
</form>
<br>
<div style="position: absolute; margin-left: 100px; margin-top:-53px;">

<a class="btn btn-warning" href="/signUp.do">Sign Up</a>

	</div>

</div>




<%@ include file="../common/footer.jspf"%>

