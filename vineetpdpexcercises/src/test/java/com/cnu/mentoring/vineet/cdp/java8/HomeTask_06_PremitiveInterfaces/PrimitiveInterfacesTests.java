package com.cnu.mentoring.vineet.cdp.java8.HomeTask_06_PremitiveInterfaces;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class PrimitiveInterfacesTests {

    private static final Logger LOGGER = Logger.getLogger(PrimitiveInterfacesTests.class);

    private static final int number = 13;

    IntConsumer printSquareOfNumber = (number) -> LOGGER.info(String.format("The square of %d is %d", number, number*number));

    IntSupplier giveRandomNumber = () -> (int) (Math.random() * 5000);

    IntPredicate isNumberPrime = (number) -> {
        if (number <= 1)
        return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    };

    @Test
    public void testIntPredicate(){
        LOGGER.info(String.format("The number %d is %s a prime number", number,isNumberPrime.test(number)));
    }

    @Test
    public void testIntConsumer(){
        printSquareOfNumber.accept(number);
    }

    @Test
    public void testIntSupplier(){
        LOGGER.info(String.format("The random number generated is %d", giveRandomNumber.getAsInt()));
    }
}
