package com.cnu.mentoring.vineet.cdp.oo.abstraction;

import org.apache.log4j.Logger;

public class LoginPage extends AbstractPage {
    private String username;
    private String password;
    private boolean isClicked = false;
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    public String getUserName() {
        LOGGER.info("Getting Login Field");
        return username;
    }

    public String getPassword() {
        LOGGER.info("Getting Password Field");
        return password;
    }

    public void clickSubmitButton() {
        LOGGER.info("Clicking Submit Button");
        isClicked = true;
    }

    public void clickSignUpLink() {
        LOGGER.info("Clicking SignUp field");
    }
}
