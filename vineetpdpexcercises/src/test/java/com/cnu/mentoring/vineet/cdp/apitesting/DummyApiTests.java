package com.cnu.mentoring.vineet.cdp.apitesting;

import com.cnu.mentoring.vineet.cdp.apitesting.pojos.RestEmployee;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class DummyApiTests {

    private static int NUMBEROFEMPLOYEES = 26;
    private static RestEmployee employee = new RestEmployee("vineet", 123345, 21, 0);
    private static String sessionCookie = "51c26b7ec9d476202ea317da8f08ecb8";
    private static final Logger LOGGER = Logger.getLogger(DummyApiTests.class);

    private static final RequestSpecification request = new RequestSpecBuilder()
                                        .setBaseUri("http://dummy.restapiexample.com/api/v1")
                                        .setContentType(ContentType.TEXT)
                                        .build();

    private static final ResponseSpecification response = new ResponseSpecBuilder()
                                                        .expectContentType(ContentType.JSON)
                                                        .expectStatusCode(200)
                                                        .build();

    /*@BeforeSuite @Ignore
    public void getCookieForCurrentSession(){
        sessionCookie = given().baseUri("http://dummy.restapiexample.com/api/v1").when().get("/employee/1").then().extract().cookie("PHPSESSID");
        LOGGER.info(sessionCookie);
    }*/

    @Test(priority = 0)
    public void verifyCountOfEmployees(){

        given()
                .spec(request)
                .cookie("PHPSESSID", sessionCookie)
        .when()
                .get("/employees")
        .then()
                .spec(response)
                .assertThat()
                .body("data.size", equalTo(NUMBEROFEMPLOYEES));
    }

    @Test(priority = 1)
    public void addNewEmployee() {
        employee = given()
                .spec(request)
                .cookie("PHPSESSID", sessionCookie)
                .body("{\"name\":\"vineet\",\"salary\":\"123345\",\"age\":\"21\"}")
        .when()
                .post("/create")
        .then()
                .spec(response)
                .assertThat()
                .body("data.name", equalTo("vineet"))
                .extract()
                .as(RestEmployee.class);
        LOGGER.info(employee.getEmployee_name() + "" +  employee.getEmployee_age());
        NUMBEROFEMPLOYEES++;
        verifyCountOfEmployees();
    }

    @Test(priority = 2)
    public void testAddedEmployeeDetails(){
        given()
                .spec(request)
                .cookie("PHPSESSID", sessionCookie)
        .when()
                .get("/employee/" + employee.getId())
        .then()
                .assertThat()
                .body("data.employee_name", equalTo(employee.getEmployee_name()),
                        "data.employee_salary", equalTo(employee.getEmployee_salary()),
                        "data.employee_age", equalTo(employee.getEmployee_age()));
    }

    @Test(priority = 3)
    public void testUpdateEmployee(){
        employee = given()
                .spec(request)
                .cookie("PHPSESSID", sessionCookie)
                .body("{\"name\":\"vineet\",\"salary\":\"123456\",\"age\":\"23\"}")
        .when()
                .put("/update/" + employee.getId())
        .then()
                .extract()
                .as(RestEmployee.class);

        given().spec(request).when().get("/employee/" + employee.getId()).then().assertThat().body("data.employee_name", equalTo("vineet"),
                "data.employee_salary", equalTo(123456),
                "data.employee_age", equalTo(23));
    }

    @Test(priority = 4)
    public void deleteEmployee(){
        given()
                .spec(request)
                .cookie("PHPSESSID", sessionCookie)
        .when()
                .delete("/delete/" + employee.getId())
        .then()
                .body("message", equalTo("successfully! deleted Records"));
    }

    @Test(priority = 5)
    public void testDeletedEmployee() {
        given()
                .spec(request)
                .cookie("PHPSESSID", sessionCookie)
        .when()
                .get("/employees")
        .then()
                .body("data.size", equalTo(--NUMBEROFEMPLOYEES));
    }
}
