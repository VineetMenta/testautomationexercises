package com.cnu.mentoring.vineet.cdp.oo.inheritance;

import org.apache.log4j.Logger;

import com.cnu.mentoring.vineet.cdp.oo.abstraction.LoginPage;

public class SignUpPage extends LoginPage {
    private String confirmEmail;
    private String confirmPassword;
    private static final Logger LOGGER = Logger.getLogger(SignUpPage.class);

    public String confirmEmail() {
        LOGGER.info("Getting Confirm Email");
        return confirmEmail;
    }

    public String confirmPassword() {
        LOGGER.info("Getting confirm Password");
        return confirmPassword;
    }
}