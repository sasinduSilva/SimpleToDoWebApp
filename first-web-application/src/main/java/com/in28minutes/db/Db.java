package com.in28minutes.db;

import java.util.ArrayList;

import com.in28minutes.signUp.User;

public class Db {
	
	public static ArrayList<User> users = new ArrayList<>();
	
	static {
		users.add(new User("Sasindu","12345"));
		users.add(new User("Thanula","12345"));
		users.add(new User("Thisara","12345"));
		users.add(new User("Patu","12345"));
		
		
	}

}
