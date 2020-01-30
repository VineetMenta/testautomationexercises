package com.cnu.mentoring.vineet.cdp.apitesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class WeekOneHomeTaskTests {

    @Test
    public void checkStatusCodeRestAssured() {
        given().
                baseUri("http://api.zippopotam.us").
        when().
                basePath("/us").
                get("/90210").
        then().
                assertThat().statusCode(200);
    }

    @Test
    public void checkStatusCodePOJ() throws IOException {
        URL endPoint = new URL("http://api.zippopotam.us/us/90210");
        HttpURLConnection httpURLConnection = (HttpURLConnection) endPoint.openConnection();
        httpURLConnection.setRequestMethod("GET");
        int statusCode = httpURLConnection.getResponseCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void checkContentTypeRestAssured() {
        given()
                .baseUri("http://api.zippopotam.us").
        when()
                .basePath("/us")
                .get("/90210").
        then()
                .assertThat()
                .contentType("application/json");
    }

    @Test
    public void checkContentTypePOJ() throws IOException{
        URL endPoint = new URL("http://api.zippopotam.us/us/90210");
        HttpURLConnection connection = (HttpURLConnection) endPoint.openConnection();
        connection.setRequestMethod("GET");
        String responseType = connection.getContentType();
        Assert.assertEquals(responseType, "application/json");
    }

    @Test
    public void checkCountryDetailsRestAssured() {
        given()
                .baseUri("http://api.zippopotam.us").
        when()
                .basePath("/us")
                .get("/90210")
        .then()
                .assertThat().statusCode(200)
                .body("country",equalTo("United States"),
                        "'country abbreviation'", equalTo("US"));
    }

    @Test
    public void checkCountryDetailsPOJ() throws IOException{
        String inputLine;
        StringBuffer response = new StringBuffer();
        URL endPoint = new URL("http://api.zippopotam.us/us/90210");
        HttpURLConnection connection = (HttpURLConnection) endPoint.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        Assert.assertTrue(response.toString().contains("\"country\": \"United States\", \"country abbreviation\": \"US\""));
    }
}
