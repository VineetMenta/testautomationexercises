package com.cnu.mentoring.vineet.cdp.designpatterns.strategypattern;

public class Context {

    private CalculatorStrategy strategy;

    public Context(CalculatorStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int numberOne, int numberTwo){
        return strategy.performCalculation(numberOne, numberTwo);
    }
}
