package com.cnu.mentoring.vineet.cdp.oo.abstraction;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AbstractPageTests {
	
	MockPage page = new MockPage();
	
    @Test
    public void testPageURL() {
        String actualPageURL = page.getPageUrl();
        String expectedPageURL = "www.google.com";
        Assert.assertEquals(actualPageURL, expectedPageURL,"Page URL is incorrect");
    }
    
    @Test
    public void testPageTitle() {
    	Assert.assertEquals("Google", page.getPageTitle(),"Page Title is incorrect");
    }
    
    @Test
    public void testProductLogo() {
    	Assert.assertEquals("Google", page.getProductLogo(),"Product Logo is incorrect");
    }

}
