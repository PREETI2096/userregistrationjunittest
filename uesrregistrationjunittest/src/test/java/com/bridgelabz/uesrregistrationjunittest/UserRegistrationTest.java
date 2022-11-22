package com.bridgelabz.uesrregistrationjunittest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
	static UserRegistration userRegistration = new UserRegistration();
@Before
  public  void display() {
	System.out.println("Welcome to User Registration Testing Program");
}
	@After
	public void afterDisplay() {
		System.out.println("End");
	}
	@Test
	public void givenFirstName_WhenValid_ShouldReturnsTrue() throws UserRegistrationException {
		boolean result = userRegistration.name.validate("Shivani");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenFirstNameWhenInValidShouldThrowUserRegistrationException() {
		Assertions.assertThrows(UserRegistrationException.class, () -> userRegistration.name.validate("shivani"));
	}

	@Test
	public void givenLastNameWhenValidShouldReturnTrue() throws UserRegistrationException {
		boolean result = userRegistration.name.validate("Kumari");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenLastNameWhenInValidShouldThrowUSerRegistrationException() throws UserRegistrationException {
		Assertions.assertThrows(UserRegistrationException.class, () -> userRegistration.name.validate("kumari"));

	}

	@Test
	public void givenEmailWhenValidShouldReturnTrue() throws UserRegistrationException {
		boolean result = userRegistration.validEmailId.validate("shivani@mail.com");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenEmailWhenInValidShouldThrowUserRegistration() throws UserRegistrationException {
		Assertions.assertThrows(UserRegistrationException.class,
				() -> userRegistration.validEmailId.validate("Shivani.mail.com.com"));

	}

	@Test
	public void givenPhoneNumWhenValidShouldReturnTrue() throws UserRegistrationException {
		boolean result = userRegistration.validPhoneNumber.validate("91 9922558888");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPhoneNumWhenInValidShouldThrowUserRegistrationException() throws UserRegistrationException {
		Assertions.assertThrows(UserRegistrationException.class,
				() -> userRegistration.validPhoneNumber.validate("9234398488"));

	}

	@Test
	public void givenPasswordWhenValidShouldReturnTrue() throws UserRegistrationException {
		boolean result = userRegistration.validPassword.validate("Shivani@gmail7.com");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordWhenInValidShouldThrowsUserRegistrationException() throws UserRegistrationException {
		Assertions.assertThrows(UserRegistrationException.class,
				() -> userRegistration.validPassword.validate("shivanigmailcom"));

	}

	@Parameterized.Parameters
	@ValueSource(strings = { "Abc@yahoo.com", "abc@gmail.com.com", })
	public void givenEmailWhenValidShouldReturnTrue(String email) throws UserRegistrationException {
		Assertions.assertTrue(userRegistration.validEmailId.validate(email));
	}

	@Parameterized.Parameters
	@ValueSource(strings = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc@%*.com", })
	public void givenEmailWhenInValidShouldThrowUserRegistrationException(String email) {
		Assertions.assertThrows(UserRegistrationException.class, () -> userRegistration.validEmailId.validate(email));
	}
}