package com.cnu.mentoring.vineet.cdp.apitesting;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;

public class WeatherHomeTaskTests {

    private static final Logger LOGGER = Logger.getLogger(WeatherHomeTaskTests.class);
    String apiKey = "5aa70bdd75870cb41ea560c7a64fec6a";

    RequestSpecification requestSpecification = new RequestSpecBuilder()
                                    .setContentType(ContentType.JSON)
                                    .setBaseUri("http://api.openweathermap.org/data/2.5/weather")
                                    .build();

    @Test
    public void getWeatherDetails() {
        Response response = given().spec(requestSpecification).when().get(String.format("?q=hyderabad&APPID=%s", apiKey));
        String latitude = response.path("coord.lat").toString();
        String longitude = response.path("coord.lon").toString();
        LOGGER.info("The latitude and longitude of hyderabad are latitude = " + latitude + " and longitude = " + longitude);
        response = given().spec(requestSpecification).when().get(String.format("?lat=%s&lon=%s&appid=%s", latitude, longitude, apiKey));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.path("name"), "Hyderabad");
        softAssert.assertEquals(response.path("sys.country"), "IN");
        softAssert.assertTrue((float) response.path("main.temp_min") > 0);
        softAssert.assertTrue((float) response.path("main.temp") > 0);
        softAssert.assertAll();
    }
}
