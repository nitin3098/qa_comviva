package com.comviva.training;

import org.junit.Test;

import com.comviva.training.emailvalidation.EmailValidator;

import junit.framework.Assert;

public class EmailValidatorTestingService {

	// Validates whether the provided email address is valid
	// Example: isValidEmail("user@example.com") -> true

	@Test
	public void isValidEmailTrueCase() {
		EmailValidator emailValidator = new EmailValidator();
		boolean actualResult = emailValidator.isValidEmail("user@example.com");
		boolean expectedResult = true;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Validates whether the provided email address is valid
	// isValidEmail("") -> false
	@Test
	public void isValidEmailFalseCase() {
		EmailValidator emailValidator = new EmailValidator();
		boolean actualResult = emailValidator.isValidEmail("");
		boolean expectedResult = false;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Checks if the provided email address is a corporate email (ends with a
	// specific domain)
	// isCorporateEmail("employee@company.com") -> true
	@Test
	public void isCorporateEmailTrueCase() {
		EmailValidator emailValidator = new EmailValidator();
		boolean actualResult = emailValidator.isCorporateEmail("user@company.com");
		boolean expectedResult = true;
		Assert.assertEquals(expectedResult, actualResult);
	}

	// Checks if the provided email address is a corporate email (ends with a
	// specific domain)
	// Example: isCorporateEmail("user@comviva.com") -> false
	@Test
	public void isCorporateEmailFalseCase() {
		EmailValidator emailValidator = new EmailValidator();
		boolean actualResult = emailValidator.isCorporateEmail("user@comviva.com");
		boolean expectedResult = false;
		Assert.assertEquals(expectedResult, actualResult);
	}
}
