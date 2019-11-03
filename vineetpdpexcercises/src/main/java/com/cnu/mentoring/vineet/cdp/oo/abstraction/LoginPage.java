package com.cnu.mentoring.vineet.cdp.oo.abstraction;

import org.apache.log4j.Logger;

public class LoginPage extends AbstractPage {
	private String loginField;
	private String passwordField;
	private static final Logger LOGGER = Logger.getLogger(AbstractPage.class);

	public String getLoginField() {
		LOGGER.info("Getting Login Field");
		return loginField;
	}

	public String getPasswordField() {
		LOGGER.info("Getting Password Field");
		return passwordField;
	}

	public void clickSubmitButton() {
		LOGGER.info("Clicking Submit Button");
	}
	
	public void clickSignUpLink() {
		LOGGER.info("Clicking SignUp field");
	}
}
