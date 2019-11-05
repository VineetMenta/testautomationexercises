package com.cnu.mentoring.vineet.cdp.oo.abstraction;

public class Driver {
	public static void main(String[] args) {
		LoginPage loginPage = new LoginPage();
		loginPage.getPageTitle();
		loginPage.getPageUrl();
		loginPage.getUserName();
		loginPage.getPassword();
		loginPage.clickSubmitButton();
	}
}
