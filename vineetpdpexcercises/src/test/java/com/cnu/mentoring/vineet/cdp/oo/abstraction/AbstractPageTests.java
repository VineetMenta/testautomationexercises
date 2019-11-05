package com.cnu.mentoring.vineet.cdp.oo.abstraction;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AbstractPageTests {
    @Test
    public void testPageURL() {
        MockPage page = new MockPage();
        String actualPageURL = page.getPageUrl();
        String expectedPageURL = "www.google.com";
        Assert.assertEquals(actualPageURL, expectedPageURL);
    }


}
