package com.in28minutes.login;

public class UserValidation{
	
	public boolean isUserValid(String user, String pw) {
		if(user.equals("Sasindu") && pw.equals("12345") ) {
			return true;
			
		}
		return false;
		
	}
	
	
}