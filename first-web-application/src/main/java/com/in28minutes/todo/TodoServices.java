package com.in28minutes.todo;

import java.util.List;
import java.util.ArrayList;

public class TodoServices {
	private static List<Todo> todos = new ArrayList();
	
	static {
		todos.add(new Todo("Learn Web Application","Coding"));
		todos.add(new Todo("Learn Spring","Coding"));
		todos.add(new Todo("Learn Spring MVC","Coding"));
		
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
		
		
	}
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
		
		
	}

}
