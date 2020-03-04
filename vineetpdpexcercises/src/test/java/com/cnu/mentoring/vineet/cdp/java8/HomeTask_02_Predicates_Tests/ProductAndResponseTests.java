package com.cnu.mentoring.vineet.cdp.java8.HomeTask_02_Predicates_Tests;

import com.cnu.mentoring.vineet.cdp.java8.HomeTask_02_Predicates.ProductAndResponseUtils;
import com.cnu.mentoring.vineet.cdp.java8.pojos.Product;
import com.cnu.mentoring.vineet.cdp.java8.pojos.Response;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductAndResponseTests {

    private static final Logger LOGGER = Logger.getLogger(ProductAndResponseTests.class);

    List<Product> products;
    List<Response> responses;

    Predicate<Product> greaterThanThousand = product -> product.getPrice() > 1000;
    Predicate<Product> greaterThanHundred = product -> product.getPrice() > 100;
    Predicate<Product> electronicsCategory = product -> product.getCategory().equalsIgnoreCase("Electronics");

    Predicate<Response> statusCode400 = response -> response.getStatusCode() == 400;
    Predicate<Response> responseTypeJSON = response -> response.getResponseType().equalsIgnoreCase("JSON");

    @DataProvider(name = "productPredicates")
    public Object[][] provideProductPredicates(){
        return new Object[][]{
                {greaterThanThousand},
                {electronicsCategory},
                {greaterThanHundred.and(electronicsCategory)},
                {greaterThanHundred.or(electronicsCategory)},
                {(greaterThanHundred.negate()).and(electronicsCategory)}};
    }

    @DataProvider(name = "responsePredicates")
    public Object[][] provideResponsePredicates(){
        return new Object[][]{
                {statusCode400},
                {responseTypeJSON},
                {statusCode400.and(responseTypeJSON)},
                {statusCode400.or(responseTypeJSON)},
                {(statusCode400.negate()).and(responseTypeJSON)}};
    }

    @BeforeClass
    public void initializeProductsAndResponsesList(){
        Product productOne = new Product(100, "Pencils", "Stationery", "A");
        Product productTwo = new Product(120, "Cups", "Crockery", "B");
        Product productThree = new Product(1500, "Phone", "Electronics", "A");
        Product productFour = new Product(150, "USB Cable", "Electronics", "B");
        Product productFive = new Product(99, "Connector", "Electronics", "C");

        products = new ArrayList<>();
        products.add(productOne);
        products.add(productTwo);
        products.add(productThree);
        products.add(productFour);
        products.add(productFive);

        Response responseOne = new Response(400, "ResponseOne Body", "JSON");
        Response responseTwo = new Response(200, "ResponseTwo Body", "APPLICATION/XML");
        Response responseThree = new Response(200, "ResponseThree Body", "JSON");
        Response responseFour = new Response(400, "ResponseFour Body", "TEXT/XML");

        responses = new ArrayList<>();
        responses.add(responseOne);
        responses.add(responseTwo);
        responses.add(responseThree);
        responses.add(responseFour);
    }

    @Test(dataProvider = "productPredicates")
    public void productsUsingPredicates(Predicate<Product> predicate){
        LOGGER.info(ProductAndResponseUtils.getProductsWithCondition(products, predicate));
    }

    @Test(dataProvider = "responsePredicates")
    public void responsesUsingPredicates(Predicate<Response> predicates){
        LOGGER.info(ProductAndResponseUtils.getResponsesWithCondition(responses, predicates));
    }
}
