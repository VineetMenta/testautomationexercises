package com.cnu.mentoring.vineet.cdp.java8.HomeTask_01;

public class Palindrome implements CheckString {
    @Override
    public boolean checkString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string).reverse();
        return stringBuilder.toString().equalsIgnoreCase(string);
    }
}
