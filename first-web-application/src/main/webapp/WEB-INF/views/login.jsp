<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	<div class="container">
		<form action="/login.do" method="post">
<p><font color="red">${errorMessage}</font></p>

 Your name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="name"/><br><br>
 you password&nbsp;&nbsp;&nbsp;<input type="password" name="password"/><br><br>
  <input type="submit" value="Sign up"/>
</form>
	</div>


<%@ include file="../common/footer.jspf"%>

