package com.cnu.mentoring.vineet.cdp.java8.pojos;

public class Employee {

    public int EmployeeId;
    public String EmployeeName;
    public Employee(int EmployeeId, String EmployeeName){
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
    }

    public int getEmployeeId() {
        return this.EmployeeId;
    }

    public String getEmployeeName() {
        return this.EmployeeName;
    }
}
