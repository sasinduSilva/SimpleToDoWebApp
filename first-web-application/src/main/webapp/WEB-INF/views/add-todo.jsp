<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
	

	<div class="container">
		Your new Action Item:
		<form method="post" action="/add-todo.do">
		<fieldset class="form-group">
		<label>Description</label> 
		<input name="todo" type="text" class="form-control"/><br>
		</fieldset>
		<fieldset class="form-group">
		 <label>Category</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  <input name="category" type="text" class="form-control"/> <br>
		  </fieldset>
		 <input name="add" type="submit" class="btn btn-success" value="Submit"/>
		</form>
	</div>
<%@ include file="../common/footer.jspf"%>

