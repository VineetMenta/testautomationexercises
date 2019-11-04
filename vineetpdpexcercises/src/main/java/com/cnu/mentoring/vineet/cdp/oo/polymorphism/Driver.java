package com.cnu.mentoring.vineet.cdp.oo.polymorphism;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class Driver {
	public static int IMPLICIT_WAIT_TIME = 5;
	private static final Logger LOGGER = Logger.getLogger(Driver.class);

	public static void main(String[] args) {
		HomePage homePage = new HomePage();
		LOGGER.info(homePage.getPageUrl());
		homePage.waitForPageToLoad(TimeUnit.SECONDS);
		homePage.waitForPageToLoad(TimeUnit.MINUTES);
		homePage.waitForPageToLoad(TimeUnit.MINUTES, IMPLICIT_WAIT_TIME);
	}
}
