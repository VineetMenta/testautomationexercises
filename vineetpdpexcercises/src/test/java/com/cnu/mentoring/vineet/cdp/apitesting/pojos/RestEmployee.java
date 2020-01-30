package com.cnu.mentoring.vineet.cdp.apitesting.pojos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestEmployee {

    @JsonAlias({"data.name", "data.employee_name"})
    String name;

    @JsonAlias({"data.salary", "data.employee_salary"})
    int salary;

    @JsonAlias({"data.age", "data.employee_age"})
    int age;

    @JsonProperty("data.id")
    int id;

    public RestEmployee(){}

    public RestEmployee(String employee_name, int employee_salary, int employee_age) {
        this.name = employee_name;
        this.salary = employee_salary;
        this.age = employee_age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
