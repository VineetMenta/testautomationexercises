package com.cnu.mentoring.vineet.cdp.oo.abstraction;

import org.apache.log4j.Logger;

public abstract class AbstractPage {
	private String pageTitle;
	private String pageUrl;
	private String productLogo;
	private static final Logger LOGGER = Logger.getLogger(AbstractPage.class);

	public String getPageTitle() {
		// Internal implementation to return pageTitle
		LOGGER.info("Getting Page Title");
		pageTitle = "Google";
		return pageTitle;
	}

	public String getPageUrl() {
		// Internal implementation to return pageUrl
		pageUrl = "www.google.com";
		LOGGER.info("Getting Page URL");
		return pageUrl;
	}

	public void performBrowserBack() {
		// Internal implementation to perform browserBack.
		LOGGER.info("Browser Back Operation is completed");
	}

	public String getProductLogo() {
		// Internal implementation to get Logo.
		productLogo = "Google";
		LOGGER.info("Getting Product Logo");
		return productLogo;
	}
}
