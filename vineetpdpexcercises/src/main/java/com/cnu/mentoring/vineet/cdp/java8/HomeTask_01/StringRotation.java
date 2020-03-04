package com.cnu.mentoring.vineet.cdp.java8.HomeTask_01;

public class StringRotation implements CheckStringRotation{

    @Override
    public boolean checkStringRotation(String mainString, String rotatedString) {
        mainString += mainString;
        return mainString.contains(rotatedString);
    }
}