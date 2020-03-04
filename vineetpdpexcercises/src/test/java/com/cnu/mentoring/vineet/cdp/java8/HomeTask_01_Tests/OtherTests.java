package com.cnu.mentoring.vineet.cdp.java8.HomeTask_01_Tests;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class OtherTests {

    private static final Logger LOGGER = Logger.getLogger(OtherTests.class);

    TreeSet<Integer> actualIntegers;
    TreeSet<Integer> reverseSortedIntegersOldWay;
    TreeSet<Integer> reverseSortedIntegersJavaEight;

    @BeforeClass
    public void initialize(){
        actualIntegers = new TreeSet<>();
        actualIntegers.add(5);
        actualIntegers.add(1);
        actualIntegers.add(6);
        actualIntegers.add(2);
        actualIntegers.add(4);
        actualIntegers.add(3);
    }

    @Test
    public void testTreeMapSortOldWay(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        reverseSortedIntegersOldWay = new TreeSet<>(comparator.reversed());
        reverseSortedIntegersOldWay.addAll(actualIntegers);
        LOGGER.info(actualIntegers);
        LOGGER.info(reverseSortedIntegersOldWay);
        Assert.assertNotSame(actualIntegers, reverseSortedIntegersOldWay);
    }

    @Test
    public void testTreeMapSortJavaEight(){
        reverseSortedIntegersJavaEight = new TreeSet<>(Comparator.reverseOrder());
        reverseSortedIntegersJavaEight.addAll(actualIntegers);
        LOGGER.info(actualIntegers);
        LOGGER.info(reverseSortedIntegersJavaEight);
        Assert.assertNotSame(actualIntegers, reverseSortedIntegersJavaEight);
    }
}
