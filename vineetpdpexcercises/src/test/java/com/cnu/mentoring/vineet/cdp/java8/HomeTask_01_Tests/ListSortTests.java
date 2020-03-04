package com.cnu.mentoring.vineet.cdp.java8.HomeTask_01_Tests;

import com.cnu.mentoring.vineet.cdp.java8.HomeTask_01.SortLists;
import com.cnu.mentoring.vineet.cdp.java8.HomeTask_01.SortNumbersList;
import com.cnu.mentoring.vineet.cdp.java8.HomeTask_01.SortingStrategy;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortTests {

    private static final Logger LOGGER = Logger.getLogger(ListSortTests.class);
    List<Integer> integers;

    @BeforeMethod
    void initializeList(){
        LOGGER.info("Reinitializing List for new Test");
        integers = new ArrayList<>();
        integers.add(9);
        integers.add(8);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(6);
        integers.add(5);
    }

    @Test
    void secondHighestNumberInListOld(){
        SortLists<Integer> sortIntegerLists = new SortNumbersList();
        List<Integer> sortedList = sortIntegerLists.sortList(integers);
        Assert.assertEquals((int) sortedList.get(sortedList.size() - 2), 8);
    }

    @Test
    void secondHighestNumberInListJava8(){
        SortLists<Integer> sortIntegerLists = (List<Integer> integers)->{
            Collections.sort(integers);
            return integers;
        };
        List<Integer> sortedList = sortIntegerLists.sortList(integers);
        Assert.assertEquals((int) sortedList.get(sortedList.size() - 2), 8);
    }

    @Test
    public void sortNumbersInReverseOrderOld(){
        List<Integer> expectedIntegerList = integers;
        expectedIntegerList.sort(Collections.reverseOrder());
        SortLists<Integer> sortLists = new SortingStrategy();
        sortLists.sortList(integers);
        Assert.assertEquals(integers, expectedIntegerList);
    }

    @Test
    public void sortNumberInReverseOrderJava8(){
        List<Integer> expectedIntegerList = integers;
        expectedIntegerList.sort(Collections.reverseOrder());
        SortLists<Integer> sortLists = (List<Integer> integers)->{
            Comparator<Integer> integerComparator = (one,two)->one-two;
            integers.sort(integerComparator.reversed());
            return integers;
        };
        sortLists.sortList(integers);
        Assert.assertEquals(integers, expectedIntegerList);
    }
}
