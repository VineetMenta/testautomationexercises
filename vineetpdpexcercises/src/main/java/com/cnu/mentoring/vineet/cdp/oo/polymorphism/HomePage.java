package com.cnu.mentoring.vineet.cdp.oo.polymorphism;

import com.cnu.mentoring.vineet.cdp.oo.abstraction.AbstractPage;
import org.apache.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class HomePage extends AbstractPage {
	private String domainUrl;
	private static final Logger LOGGER = Logger.getLogger(HomePage.class);

	// method overriding
	@Override
	public String getPageUrl() {
		domainUrl = "google.com";
		return domainUrl;
	}
	
	// method Overloading
	public void waitForPageToLoad(TimeUnit timeUnit) {
		LOGGER.info("Waiting for page to load for " + timeUnit.toString());
	}
	
	public void waitForPageToLoad(TimeUnit timeUnit, int implicitWaitSeconds) {
		LOGGER.info("Waiting for page to load for "+timeUnit.toString() +" with Implicit wait "+implicitWaitSeconds+" seconds");
	}
}
