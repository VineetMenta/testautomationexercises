package com.cnu.mentoring.vineet.cdp.java8.HomeTask_1;

import java.util.Comparator;
import java.util.List;

public class SortNumbersReverseOrder implements SortLists<Integer> {

    @Override
    public List<Integer> sortList(List<Integer> list) {
        Comparator<Integer> comparator = new SortingStrategy();
        comparator = comparator.reversed();
        list.sort(comparator);
        return list;
    }
}
