package com.cnu.mentoring.vineet.cdp.apitesting.pojos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestEmployee {

    @JsonAlias({"data.name", "data.employee_name"})
    String employee_name;

    @JsonAlias({"data.salary", "data.employee_salary"})
    int employee_salary;

    @JsonAlias({"data.age", "data.employee_age"})
    int employee_age;

    @JsonProperty("data.id")
    int id;

    public RestEmployee(){}

    public RestEmployee(String employee_name, int employee_salary, int employee_age, int id) {
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
