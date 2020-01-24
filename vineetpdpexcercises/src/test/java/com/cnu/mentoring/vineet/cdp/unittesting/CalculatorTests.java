package com.cnu.mentoring.vineet.cdp.unittesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTests {

    Calculator calculator = new Calculator();

    @BeforeClass
    public void setCalculatorObject(){
        System.out.println("@BeforeClass");
        calculator = new Calculator();
    }

    @Test (priority = 1, invocationCount = 10)
    public void testAddNumbers(){
        Assert.assertEquals(calculator.addNumbers(1234567890,223534645) , 1458102535);
    }

    @Test (enabled = false)
    public void testSubtractNumbers(){
        Assert.assertEquals(calculator.subtractNumbers(1,2 ), -1);
    }

    @Test
    public void testMultiplyNumbers(){
        Assert.assertEquals(calculator.multiplyNumbers(1,2), 2);
    }

    @Test
    public void testDivideNumbers(){
        Assert.assertEquals(calculator.divideNumbers(1,2), 0);
    }
}
