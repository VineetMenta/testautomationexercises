package com.cnu.mentoring.vineet.cdp.oo.inheritance;

import org.apache.log4j.Logger;

public class Driver {
	private static final Logger LOGGER = Logger.getLogger(Driver.class);

	public static void main(String[] args) {
		SignUpPage signUpPage = new SignUpPage();
		signUpPage.clickSignUpLink();
		signUpPage.getLoginField();
		signUpPage.getPasswordField();
		signUpPage.confirmEmail();
		signUpPage.confirmPassword();
		signUpPage.clickSubmitButton();
		LOGGER.info("User is signed up for the product");
	}
}
