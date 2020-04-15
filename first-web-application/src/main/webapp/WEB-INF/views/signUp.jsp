<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<div class="form-group container">
<form action="/signUp.do" method="post">
<p class="alert-danger">${userExist}</p>
<p class="alert-danger">${pwNotMatching}</p>	

Name  <input class="input-sm form-control" type="text" name="userName"><br><br>
Password <input class="input-sm form-control" type="password" name="password"><br><br>
Confirm Password <input class="input-sm form-control" type="password" name="confirmPassword"><br><br>
<input class="btn btn-success" type="submit" value="Create User"> 



</form>

</div>

<%@ include file="../common/footer.jspf"%>

