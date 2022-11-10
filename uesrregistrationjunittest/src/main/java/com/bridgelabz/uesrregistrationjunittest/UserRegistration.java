package com.bridgelabz.uesrregistrationjunittest;
import java.util.regex.*;
public class UserRegistration {

	public static final String VALIDATE_FIRST_NAME= "^[A-Z]{1}[a-zA-Z]{2,}$";
	

	public Boolean checkFirstName(String firstName) {
	
		return (Pattern.matches(VALIDATE_FIRST_NAME, firstName));
	}

}


