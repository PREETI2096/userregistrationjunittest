package com.bridgelabz.uesrregistrationjunittest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	
@Before
  public  void display() {
	System.out.println("Welcome to User Registration Testing Program");
}
	@After
	public void afterDisplay() {
		System.out.println("End");
	}
	
	@Test
	public void given_first_name_should_returnTrue() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkFirstName("Preeti");
		Assert.assertEquals(result,true);
	}
//	@Test
//	public void given_first_name_should_returnFalse() {
//		UserRegistration user = new UserRegistration();
//		Boolean result = user.checkFirstName("preeti");
//		Assert.assertEquals(result,false);
//	}
	
	@Test
	public void given_last_name_should_returnTrue() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkLastName("Ghatage");
		Assert.assertEquals(result,true);
	}
//	@Test
//	public void given_last_name_should_returnFalse() {
//		UserRegistration user = new UserRegistration();
//		Boolean result = user.checkLastName("gha");
//		Assert.assertEquals(result,false);
//	}
	@Test
	public void given_email_id_should_returnTrue() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.checkEmailId("pree12@gmail.com");
		Assert.assertEquals(result,true);	
	}
//	@Test
//	public void given_email_id_should_returnFalse() {
//		UserRegistration user = new UserRegistration();
//		Boolean result = user.checkEmailId("pree.mail.gmail.com");
//		Assert.assertEquals(result,false);	
//	}
   @Test
  public  void given_phone_number_should_returnTrue() {
	   UserRegistration user = new UserRegistration();
		Boolean result = user.checkPhoneNumber("91 8553266354");
		Assert.assertEquals(result,true);	
   }
//   @Test
//   public  void given_phone_number_should_returnFalse() {
// 	   UserRegistration user = new UserRegistration();
// 		Boolean result = user.checkPhoneNumber("8553266354");
// 		Assert.assertEquals(result,false);	
//    }
	@Test
	public void given_password_should_returnTrue() {
		UserRegistration user = new UserRegistration();
		Boolean result = user.password("Srikrishna@34");
		Assert.assertEquals(result,true);		
	}
//	@Test
//	public void given_password_should_returnFalse() {
//		UserRegistration user = new UserRegistration();
//		Boolean result = user.password("sr34");
//		Assert.assertEquals(result,false);		
	}

