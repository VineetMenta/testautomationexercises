package com.cnu.mentoring.vineet.cdp.oo.encaptulation;

import org.apache.log4j.Logger;

public class EmployeeDriver {
    private static final Logger LOGGER = Logger.getLogger(EmployeeDriver.class);

    public static void main(String[] args) {
        Employee employee = new Employee(101, 5000, "Srinivas");
        employee.setEmployeeSalary(10000);
        LOGGER.info(employee);
    }
}
