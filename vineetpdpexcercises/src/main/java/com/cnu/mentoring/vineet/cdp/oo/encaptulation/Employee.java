package com.cnu.mentoring.vineet.cdp.oo.encaptulation;

public class Employee {

    private int employeeId;
    private double employeeSalary;
    private String employeeName;

    public Employee(int employeeId, double employeeSalary, String employeeName) {
        this.setEmployeeId(employeeId);
        this.setEmployeeName(employeeName);
        this.setEmployeeSalary(employeeSalary);
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeSalary(double employeeSalary) {
        if (AuthenticationService.isValidUser(this)) {
            this.employeeSalary = employeeSalary;
        }
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public double getEmployeeSalary() {
        return this.employeeSalary;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append("Name   :");
        returnString.append(employeeName);
        returnString.append("\n");
        returnString.append("ID   :");
        returnString.append(employeeId);
        returnString.append("\n");
        returnString.append("Salary :");
        returnString.append(employeeSalary);

        return returnString.toString();
    }
}
