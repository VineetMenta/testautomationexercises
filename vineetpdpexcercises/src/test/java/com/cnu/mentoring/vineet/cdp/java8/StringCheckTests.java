package com.cnu.mentoring.vineet.cdp.java8;

import com.cnu.mentoring.vineet.cdp.java8.HomeTask_1.CheckString;
import com.cnu.mentoring.vineet.cdp.java8.HomeTask_1.CheckStringRotation;
import com.cnu.mentoring.vineet.cdp.java8.HomeTask_1.Palindrome;
import com.cnu.mentoring.vineet.cdp.java8.HomeTask_1.StringRotation;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StringCheckTests {

    private static final Logger LOGGER = Logger.getLogger(StringCheckTests.class);

    @Test
    void checkStringPalindrome(){
        String string = "Madam";
        SoftAssert softAssert = new SoftAssert();
        CheckString palindrome = new Palindrome();
        LOGGER.info("Old Way");
        logMessage(palindrome.checkString("Madam"));
        softAssert.assertTrue(palindrome.checkString("Madam"));

        LOGGER.info("Java 8 Way");
        palindrome = (stringToCheck) -> {
            StringBuilder stringBuilder = new StringBuilder(stringToCheck).reverse();
            return stringBuilder.toString().equalsIgnoreCase(stringToCheck);
        };
        logMessage(palindrome.checkString("Madam"));
        softAssert.assertTrue(palindrome.checkString("Madam"));
        softAssert.assertAll();
    }

    @Test
    void checkStringRotation(){
        String mainString = "abcdefg";
        String rotatedString = "efgabcd";
        SoftAssert softAssert = new SoftAssert();
        CheckStringRotation rotation = new StringRotation();
        LOGGER.info("Old Way");
        logMessage(rotation.checkStringRotation(mainString, rotatedString));
        softAssert.assertTrue(rotation.checkStringRotation(mainString, rotatedString));
        LOGGER.info("Java 8 Way");
        rotation = (mainStr, rotatedStr) -> {
            mainStr += mainStr;
            return mainStr.contains(rotatedStr);
        };
        logMessage(rotation.checkStringRotation(mainString, rotatedString));
        softAssert.assertTrue(rotation.checkStringRotation(mainString, rotatedString));
        softAssert.assertAll();
    }

    public static void logMessage(boolean value){
        if(value){
            LOGGER.info("The checked condition for given string is true");
        }
        else{
            LOGGER.info("The checked condition for given string is not true");
        }
    }
}
