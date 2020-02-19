package com.cnu.mentoring.vineet.cdp.java8;

import com.cnu.mentoring.vineet.cdp.java8.HomeTask_1.SortEmployees;
import com.cnu.mentoring.vineet.cdp.java8.pojos.Employee;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeTests {

    private static final Logger LOGGER = Logger.getLogger(EmployeeTests.class);
    TreeMap<String, Employee> employeesMap;
    TreeMap<String, Employee> employeesMapActual;
    TreeMap<String, Employee> employeeMapJavaEight;
    TreeSet<Employee> employeesSet;
    TreeSet<Employee> employeesSetJavaEight;
    SortEmployees sortEmployees = new SortEmployees();

    @BeforeClass
    public void initializeEmployees(){
        Employee vineet = new Employee(1, "vineet");
        Employee harshini = new Employee(2, "harshini");
        Employee naveen = new Employee(3, "naveen");

        employeesMapActual = new TreeMap<>();
        employeesMapActual.put(vineet.getEmployeeName(),vineet);
        employeesMapActual.put(harshini.getEmployeeName(), harshini);
        employeesMapActual.put(naveen.getEmployeeName(), naveen);

        employeesMap = new TreeMap(sortEmployees.reversed());
        employeesMap.put(vineet.getEmployeeName(),vineet);
        employeesMap.put(harshini.getEmployeeName(), harshini);
        employeesMap.put(naveen.getEmployeeName(), naveen);

        employeeMapJavaEight = new TreeMap<String, Employee>(
                (stringOne, stringTwo) -> {
                    if ((stringOne).compareTo(stringTwo) > 0)
                        return 1;
                    else if ((stringOne).compareTo(stringTwo) < 0)
                        return -1;
                    else
                        return 0;
                });
        employeeMapJavaEight.put(vineet.getEmployeeName(),vineet);
        employeeMapJavaEight.put(harshini.getEmployeeName(), harshini);
        employeeMapJavaEight.put(naveen.getEmployeeName(), naveen);
    }

    @Test
    public void sortMapOfEmployees(){
        Assert.assertNotSame(employeesMapActual, employeesMap);
    }

    @Test
    public void sortMapOfEmployeesJavaEight(){
        Assert.assertNotSame(employeesMapActual, employeesMap);
    }
}
