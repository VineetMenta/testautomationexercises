package com.cnu.mentoring.vineet.cdp.java8.HomeTask_1;

import com.cnu.mentoring.vineet.cdp.java8.pojos.Employee;

import java.util.Comparator;

public class SortEmployees implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if ((o1.getEmployeeName()).compareTo(o2.getEmployeeName()) > 0)
            return 1;
        else if ((o1.getEmployeeName()).compareTo(o2.getEmployeeName()) < 0)
            return -1;
        else
            return 0;
    }
}
