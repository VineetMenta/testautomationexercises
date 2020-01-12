package com.cnu.mentoring.vineet.cdp.apitesting;

import com.cnu.mentoring.vineet.cdp.apitesting.pojos.Event;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class EventsHomeTaskTests {

    Logger LOGGER = Logger.getLogger(EventsHomeTaskTests.class);

    RequestSpecification request = new RequestSpecBuilder()
                                    .setBaseUri("https://events.epam.com/api/v2")
                                    .setContentType(ContentType.JSON)
                                    .build();

    ResponseSpecification response = new ResponseSpecBuilder()
                                        .expectStatusCode(200)
                                        .expectContentType(ContentType.JSON)
                                        .build();
    @Test
    public void getEventDetails() {
        Response response = given().spec(request)
                            .when().get("/events");
        List<Map<Event, ?>> events = response.path("events.findAll{it.language == 'En'}");
        LOGGER.info("The number of epam events in English are " + events.size());
        LOGGER.info("The events are " + events);
        Assert.assertEquals(events.size(), 4);
    }
}
