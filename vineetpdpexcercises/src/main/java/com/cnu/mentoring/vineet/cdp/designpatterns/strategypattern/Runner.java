package com.cnu.mentoring.vineet.cdp.designpatterns.strategypattern;

import org.apache.log4j.Logger;

public class Runner {

    private static final Logger LOGGER = Logger.getLogger(Runner.class);

    public static void main(String[] args){
        Context context = new Context(new AddNumbers());
        LOGGER.info("The sum of numbers 5, 6 is " + context.executeStrategy(5,6));
        context = new Context(new SubtractNumbers());
        LOGGER.info("The difference of the numbers 5, 6 is " + context.executeStrategy(5,6));
        context = new Context(new MultiplyNumbers());
        LOGGER.info("The product of numbers 5, 6 is " + context.executeStrategy(5,6));
    }
}
