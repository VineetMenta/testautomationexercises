package com.cnu.mentoring.vineet.cdp.unittesting;

import com.epam.tat.module4.Calculator;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorHomeTaskTests {

    private static final Logger LOGGER = Logger.getLogger(CalculatorHomeTaskTests.class);
    Calculator calculator;

    @DataProvider(name = "calculatorInput")
    public Object[][] calculatorInputs(){
        return new Object[][]{ {150, 100}};
    }

    @DataProvider(name = "singleCalculatorInput")
    public Object[][] singleCalculatorInput(){
        return new Object[][]{{100}};
    }

    @BeforeClass(groups = {"positive", "negative"})
    public void initializeCalculator(){
        calculator = new Calculator();
    }

    @BeforeMethod(groups = {"positive", "negative"})
    public void notifyStartTimeOfExecution(){
        LOGGER.info("Started method execution");
    }

    @Test(dataProvider = "calculatorInput", groups = {"positive"})
    public void testAddFunctionPositive(double firstInput, double secondInput){
        Assert.assertEquals(calculator.sum(firstInput, secondInput), 250);
    }

    @Test(dataProvider = "calculatorInput", groups = {"negative"})
    public void testAddFunctionNegative(double firstInput, double secondInput){
        Assert.assertEquals(calculator.sum(firstInput, secondInput), 233);
    }

    @Test(dataProvider = "calculatorInput", groups = {"positive"})
    public void testDifferenceFunctionPositive(double firstInput, double secondInput){
        Assert.assertEquals(calculator.sub(firstInput, secondInput), 50);
    }

    @Test(dataProvider = "calculatorInput", groups = {"negative"})
    public void testDifferenceFunctionNegative(double firstInput, double secondInput){
        Assert.assertEquals(calculator.sub(firstInput, secondInput), 44);
    }

    @Test(dataProvider = "calculatorInput", groups = {"positive"})
    public void testProductFunctionPositive(double firstInput, double secondInput){
        Assert.assertEquals(calculator.mult(firstInput, secondInput), 15000);
    }

    @Test(dataProvider = "calculatorInput", groups = {"negative"})
    public void testProductFunctionNegative(double firstInput, double secondInput){
        Assert.assertEquals(calculator.mult(firstInput, secondInput), 150);
    }

    @Test(dataProvider = "calculatorInput", groups = {"positive"})
    public void testDivisionFunctionPositive(double firstInput, double secondInput){
        Assert.assertEquals(calculator.div(firstInput, secondInput), 1.5);
    }

    @Test(dataProvider = "calculatorInput", groups = {"negative"})
    public void testDivisionFunctionNegative(double firstInput, double secondInput){
        Assert.assertEquals(calculator.div(firstInput, secondInput), 150);
    }

    @Test(dataProvider = "singleCalculatorInput", groups = {"positive"})
    public void testIsPositiveFunctionPositive(long firstInput){
        Assert.assertTrue(calculator.isPositive(firstInput));
    }

    @Test(dataProvider = "singleCalculatorInput", groups = {"negative"})
    public void testIsNegativeFunctionNegative(long firstInput){
        Assert.assertTrue(calculator.isNegative(firstInput));
    }

    @AfterMethod(groups = {"positive", "negative"})
    public void notifyEndTimeOfExecution(){
        LOGGER.info("Ended method execution");
    }

    @AfterClass(groups = {"positive", "negative"})
    public void deinitializeCalculator(){
        calculator = null;
    }
}
