package com.cnu.mentoring.vineet.cdp.apitesting;

import com.cnu.mentoring.vineet.cdp.apitesting.pojos.Category;
import com.cnu.mentoring.vineet.cdp.apitesting.pojos.Pet;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class WeekTwoHomeTaskTests {

    private RequestSpecification request = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .addHeader("api_key", "special-key")
            .setBaseUri("https://petstore.swagger.io/v2")
            .setBasePath("/pet")
            .build();

    private ResponseSpecification response = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectContentType(ContentType.JSON)
            .build();

    private Pet actualPet;

    @Test
    public void testPetStorePets() {
        actualPet = given().spec(request)
                .when().get("/12345").as(Pet.class);
        Pet expectedPet = new Pet(12345, new Category(0, "string"), "pepe", new String[]{"string"}, "Ok");
        Assert.assertEquals(actualPet, expectedPet);
    }

    @Test
    public void testPetStorePetsName() {
        actualPet = given().spec(request)
                .when().get("/1234").as(Pet.class);
        Pet expectedPet = new Pet();
        expectedPet.setName("doggie");
        Assert.assertEquals(actualPet.getName(), expectedPet.getName());
    }
}
