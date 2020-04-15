package com.in28minutes.login;
import com.in28minutes.db.Db;
import com.in28minutes.signUp.User;

public class UserValidation{
	
	Db db = new Db();
	
	public boolean isUserValid(String user, String pw) {
		for (User testUser : db.users) {
			
			if(testUser.getName().equals(user) && testUser.getPassword().equals(pw)) {
				return true;
				
				
				
			}
			
			
		}
		
		
		
		
		return false;	
	
	}
	
		
	}
	
	
