package com.cnu.mentoring.vineet.cdp.java8.HomeTask_01;

import java.util.Comparator;

public class SortEmployeesMap implements Comparator<String> {

    @Override
    public int compare(String stringOne, String stringTwo) {
        if ((stringOne).compareTo(stringTwo) > 0)
            return -1;
        else if ((stringOne).compareTo(stringTwo) < 0)
            return 1;
        else
            return 0;
    }
}
