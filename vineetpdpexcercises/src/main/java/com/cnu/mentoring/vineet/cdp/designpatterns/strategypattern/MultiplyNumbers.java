package com.cnu.mentoring.vineet.cdp.designpatterns.strategypattern;

public class MultiplyNumbers implements CalculatorStrategy {
    @Override
    public int performCalculation(int numberOne, int numberTwo) {
        return numberOne*numberTwo;
    }
}
