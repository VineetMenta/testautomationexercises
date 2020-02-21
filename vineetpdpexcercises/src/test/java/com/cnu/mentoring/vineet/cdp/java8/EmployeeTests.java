package com.cnu.mentoring.vineet.cdp.java8;

import com.cnu.mentoring.vineet.cdp.java8.HomeTask_1.SortEmployees;
import com.cnu.mentoring.vineet.cdp.java8.HomeTask_1.SortEmployeesMap;
import com.cnu.mentoring.vineet.cdp.java8.pojos.Employee;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

public class EmployeeTests {

    private static final Logger LOGGER = Logger.getLogger(EmployeeTests.class);

    TreeMap<String, Employee> employeesMap;
    TreeMap<String, Employee> employeesMapActual;
    TreeMap<String, Employee> employeeMapJavaEight;

    List<Employee> actualEmployeeList;
    List<Employee> sortedEmployeeListOldWay;
    List<Employee> sortedEmployeeListJavaEight;

    List<Employee> actualEmployeeListCollections;
    List<Employee> sortedEmployeeListOldWayCollections;
    List<Employee> sortedEmployeeListJavaEightCollections;

    TreeSet<Employee> sortedEmployeeSetOldWay;
    TreeSet<Employee> sortedEmployeesSetJavaEight;

    SortEmployeesMap sortEmployees = new SortEmployeesMap();

    @BeforeClass
    public void initializeEmployees() {
        Employee vineet = new Employee(1, "vineet");
        Employee harshini = new Employee(2, "harshini");
        Employee naveen = new Employee(3, "naveen");

        actualEmployeeList = new ArrayList<Employee>();
        actualEmployeeList.add(vineet);
        actualEmployeeList.add(harshini);
        actualEmployeeList.add(naveen);

        actualEmployeeListCollections = new ArrayList<Employee>();
        actualEmployeeListCollections.add(vineet);
        actualEmployeeListCollections.add(harshini);
        actualEmployeeListCollections.add(naveen);

        employeesMapActual = new TreeMap<>();
        employeesMapActual.put(vineet.getEmployeeName(), vineet);
        employeesMapActual.put(harshini.getEmployeeName(), harshini);
        employeesMapActual.put(naveen.getEmployeeName(), naveen);

        employeesMap = new TreeMap(sortEmployees);
        employeesMap.put(vineet.getEmployeeName(), vineet);
        employeesMap.put(harshini.getEmployeeName(), harshini);
        employeesMap.put(naveen.getEmployeeName(), naveen);

        employeeMapJavaEight = new TreeMap<String, Employee>(
                (stringOne, stringTwo) -> {
                    if ((stringOne).compareTo(stringTwo) > 0)
                        return -1;
                    else if ((stringOne).compareTo(stringTwo) < 0)
                        return 1;
                    else
                        return 0;
                });
        employeeMapJavaEight.put(vineet.getEmployeeName(), vineet);
        employeeMapJavaEight.put(harshini.getEmployeeName(), harshini);
        employeeMapJavaEight.put(naveen.getEmployeeName(), naveen);
    }

    @Test
    public void sortMapOfEmployees() {
        LOGGER.info(employeesMapActual);
        LOGGER.info(employeesMap);
        Assert.assertNotEquals(employeesMapActual.toString(), employeesMap.toString());
    }

    @Test
    public void sortMapOfEmployeesJavaEight() {
        LOGGER.info(employeesMapActual);
        LOGGER.info(employeeMapJavaEight);
        Assert.assertNotEquals(employeesMapActual.toString(), employeeMapJavaEight.toString());
    }

    @Test
    public void sortListEmployeeOld() {
        sortedEmployeeListOldWay = new ArrayList<Employee>();
        sortedEmployeeListOldWay.addAll(actualEmployeeList);
        sortedEmployeeListOldWay.sort(new SortEmployees());
        LOGGER.info(actualEmployeeList);
        LOGGER.info(sortedEmployeeListOldWay);
        Assert.assertNotEquals(sortedEmployeeListOldWay.toString(), actualEmployeeList.toString());
    }

    @Test
    public void sortListEmployeeJavaEight() {
        sortedEmployeeListJavaEight = new ArrayList<Employee>();
        sortedEmployeeListJavaEight.addAll(actualEmployeeList);
        sortedEmployeeListJavaEight.sort((employeeOne, employeeTwo) ->
        {
            if ((employeeOne.getEmployeeName()).compareTo(employeeTwo.getEmployeeName()) > 0)
                return 1;
            else if ((employeeOne.getEmployeeName()).compareTo(employeeTwo.getEmployeeName()) < 0)
                return -1;
            else
                return 0;
        });
        LOGGER.info(actualEmployeeList);
        LOGGER.info(sortedEmployeeListJavaEight);
        Assert.assertNotSame(sortedEmployeeListJavaEight.toString(), actualEmployeeList.toString());
    }

    @Test
    public void sortSetOfEmployeesOldWay() {
        sortedEmployeeSetOldWay = new TreeSet<>(new SortEmployees());
        sortedEmployeeSetOldWay.addAll(actualEmployeeList);
        LOGGER.info(sortedEmployeeSetOldWay);
        LOGGER.info(actualEmployeeList);
        Assert.assertNotEquals(sortedEmployeeSetOldWay, actualEmployeeList);
    }

    @Test
    public void sortSetOfEmployeesJavaEight() {
        sortedEmployeesSetJavaEight = new TreeSet<>((employeeOne, employeeTwo) ->
        {
            if ((employeeOne.getEmployeeName()).compareTo(employeeTwo.getEmployeeName()) > 0)
                return 1;
            else if ((employeeOne.getEmployeeName()).compareTo(employeeTwo.getEmployeeName()) < 0)
                return -1;
            else
                return 0;
        });
        sortedEmployeesSetJavaEight.addAll(actualEmployeeList);
        LOGGER.info(sortedEmployeesSetJavaEight);
        LOGGER.info(actualEmployeeList);
        Assert.assertNotEquals(sortedEmployeesSetJavaEight, actualEmployeeList);
    }

    @Test
    public void sortEmployeesCollectionSortOldWay(){
        sortedEmployeeListOldWayCollections = new ArrayList<>();
        sortedEmployeeListOldWayCollections.addAll(actualEmployeeListCollections);
        Comparator<Employee> comparator= new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if ((o1.getEmployeeName()).compareTo(o2.getEmployeeName()) > 0)
                    return 1;
                else if ((o1.getEmployeeName()).compareTo(o2.getEmployeeName()) < 0)
                    return -1;
                else
                    return 0;
            }
        };
        Collections.sort(sortedEmployeeListOldWayCollections, comparator);
        LOGGER.info(actualEmployeeListCollections);
        LOGGER.info(sortedEmployeeListOldWayCollections);
        Assert.assertNotEquals(actualEmployeeListCollections, sortedEmployeeListOldWayCollections);
    }

    @Test
    public void sortEmployeesCollectionSortJavaEight(){
        sortedEmployeeListJavaEightCollections = new ArrayList<>();
        sortedEmployeeListJavaEightCollections.addAll(actualEmployeeListCollections);
        Collections.sort(sortedEmployeeListJavaEightCollections, (Employee o1, Employee o2)->{
            if ((o1.getEmployeeName()).compareTo(o2.getEmployeeName()) > 0)
                return 1;
            else if ((o1.getEmployeeName()).compareTo(o2.getEmployeeName()) < 0)
                return -1;
            else
                return 0;
        });
        LOGGER.info(actualEmployeeListCollections);
        LOGGER.info(sortedEmployeeListJavaEightCollections);
        Assert.assertNotEquals(actualEmployeeListCollections, sortedEmployeeListJavaEightCollections);
    }
}
