package com.cnu.mentoring.vineet.cdp.java8.HomeTask_1;

import org.apache.log4j.Logger;

public class Runner {

    private static final Logger LOGGER = Logger.getLogger(Runner.class);

    public static void main(String[] args){
        String str = "Madam";
        CheckString palindrome = new Palindrome();

        LOGGER.info("Old way");
        logMessage(palindrome.checkString(str));

        LOGGER.info("New way (Java 8)");
        palindrome = (stringToCheck) -> {
            StringBuilder stringBuilder = new StringBuilder(stringToCheck).reverse();
            return stringBuilder.toString().equalsIgnoreCase(stringToCheck);
        };
        logMessage(palindrome.checkString(str));
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
