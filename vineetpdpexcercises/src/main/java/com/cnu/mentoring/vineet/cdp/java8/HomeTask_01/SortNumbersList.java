package com.cnu.mentoring.vineet.cdp.java8.HomeTask_01;

import java.util.Collections;
import java.util.List;

public class SortNumbersList implements SortLists<Integer> {
    @Override
    public List<Integer> sortList(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
