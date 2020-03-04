package com.cnu.mentoring.vineet.cdp.java8.HomeTask_01;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStrategy implements Comparator<Integer>,SortLists<Integer> {
    @Override
    public int compare(Integer intOne, Integer intTwo) {
        return intOne - intTwo;
    }

    @Override
    public List<Integer> sortList(List<Integer> list) {
       Collections.sort(list, this.reversed());
       return list;
    }
}
