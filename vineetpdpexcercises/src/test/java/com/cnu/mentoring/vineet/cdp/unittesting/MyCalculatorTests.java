package com.cnu.mentoring.vineet.cdp.unittesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyCalculatorTests {

    MyCalculator myCalculator;

    @BeforeClass
    public void setCalculatorObject(){
        myCalculator = new MyCalculator();
    }

    @Test (priority = 1, invocationCount = 10)
    public void testAddNumbers(){
        Assert.assertEquals(myCalculator.addNumbers(1234567890,223534645) , 1458102535);
    }

    @Test (enabled = false)
    public void testSubtractNumbers(){
        Assert.assertEquals(myCalculator.subtractNumbers(1,2 ), -1);
    }

    @Test
    public void testMultiplyNumbers(){
        Assert.assertEquals(myCalculator.multiplyNumbers(1,2), 2);
    }

    @Test
    public void testDivideNumbers(){
        Assert.assertEquals(myCalculator.divideNumbers(1,2), 0);
    }
}
