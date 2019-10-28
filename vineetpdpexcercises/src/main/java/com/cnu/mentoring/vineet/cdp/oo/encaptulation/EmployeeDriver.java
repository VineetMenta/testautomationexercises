package com.cnu.mentoring.vineet.cdp.oo.encaptulation;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee employee = new Employee(101, 5000, "Srinivas");

        employee.setEmployeeSalary(10000);

        System.out.println(employee);
    }
}
