package com.cnu.mentoring.vineet.cdp.apitesting;

import com.cnu.mentoring.vineet.cdp.apitesting.pojos.RestEmployee;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class DummyApiTests {

    private static int NUMBER_OF_EMPLOYEES = 24;
    private static RestEmployee employee = new RestEmployee("vineet", 123345, 21);
    private static final Logger LOGGER = Logger.getLogger(DummyApiTests.class);

    private static RequestSpecification request;

    private static ResponseSpecification response;

    @BeforeClass
    public void setReqAndResSpecification(){
        Response allEmployeeDetails = given()
                .when()
                .get("/employees");

        String sessionCookie = allEmployeeDetails.cookie("PHPSESSID");

        request = new RequestSpecBuilder()
                .setBaseUri("http://dummy.restapiexample.com/api/v1")
                .setContentType(ContentType.JSON)
                .addCookie("PHPSESSID", sessionCookie)
                .build();

        response = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(200)
                .build();
    }

    @Test
    public void verifyCountOfEmployees(){
        given()
                .spec(request)
        .when()
                .get("/employees")
        .then()
                .assertThat()
                .body("data.size", greaterThanOrEqualTo(NUMBER_OF_EMPLOYEES));
    }

    @Test(dependsOnMethods = {"verifyCountOfEmployees"})
    public void addNewEmployee() {
        int empId = given()
                .spec(request)
                .body(employee)
        .when()
                .post("/create")
        .then()
                .spec(response)
                .assertThat()
                .body("data.name", equalTo(employee.getName()))
                .extract()
                .path("data.id");
        employee.setId(empId);
        LOGGER.info(employee.getId() + " " + employee.getName() + " " +  employee.getAge());
        NUMBER_OF_EMPLOYEES++;
        verifyCountOfEmployees();
    }

    @Test(dependsOnMethods = {"addNewEmployee"})
    public void testAddedEmployeeDetails(){
        given()
                .spec(request)
        .when()
                .get("/employee/" + employee.getId())
        .then()
                .assertThat()
                .body("data.employee_name", equalTo(employee.getName()),
                        "data.employee_salary", equalTo(employee.getSalary()),
                        "data.employee_age", equalTo(employee.getAge()));
    }

    @Test(dependsOnMethods = {"testAddedEmployeeDetails"})
    public void testUpdatedEmployee(){
        employee.setAge(23);
        employee.setSalary(1234567);

        given()
                .spec(request)
                .body(employee)
        .when()
                .put("/update/" + employee.getId())
        .then()
                .spec(response)
                .log().all()
                .assertThat()
                .body("data.employee_name", equalTo(employee.getName()),
                        "data.employee_salary", equalTo(employee.getSalary()),
                        "data.employee_age", equalTo(employee.getAge()),
                        "data.id", equalTo(employee.getId()));
    }

    @Test(dependsOnMethods = {"testUpdatedEmployee"})
    public void deleteEmployee(){
        given()
                .spec(request)
        .when()
                .delete("/delete/" + employee.getId())
        .then()
                .body("message", equalTo("successfully! deleted Records"));
    }

    @Test(dependsOnMethods = {"deleteEmployee"})
    public void testDeletedEmployee() {
        given()
                .spec(request)
        .when()
                .get("/employee/" + employee.getId())
        .then()
                .body("data", equalTo("Record does not found."));
    }
}
