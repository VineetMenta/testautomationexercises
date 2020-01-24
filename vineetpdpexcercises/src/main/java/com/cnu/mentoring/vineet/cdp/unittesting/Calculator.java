package com.cnu.mentoring.vineet.cdp.unittesting;

public class Calculator {

    public Calculator(){
        System.out.println("Invoked");
    }

    public int addNumbers(int a, int b){
        return a+b;
    }

    public int subtractNumbers(int a, int b){
        return a-b;
    }

    public int multiplyNumbers(int a, int b){
        return a*b;
    }

    public int divideNumbers(int a, int b){
        return a/b;
    }
}
