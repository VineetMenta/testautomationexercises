package com.cnu.mentoring.vineet.cdp.java8.HomeTask_04_ConsumerAndSupplier;

import com.cnu.mentoring.vineet.cdp.java8.pojos.Product;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConsumerAndSupplierTests {

    private static final Logger LOGGER = Logger.getLogger(ConsumerAndSupplierTests.class);

    List<Product> products;

    @BeforeClass
    public void initializeProductsList() {
        Product productOne = new Product(100, "Pencils", "Stationery", "A");
        Product productTwo = new Product(120, "Cups", "Crockery", "B");
        Product productThree = new Product(1500, "Phone", "Electronics", "A");
        Product productFour = new Product(150, "USB Cable", "Electronics", "B");
        Product productFive = new Product(99, "Connector", "Electronics", "C");
        Product productSix = new Product(10000, "Phone", "Electronics", "C");

        products = new ArrayList<>();
        products.add(productOne);
        products.add(productTwo);
        products.add(productThree);
        products.add(productFour);
        products.add(productFive);
        products.add(productSix);
    }

    @Test
    public void testProductConsumers(){

    }
}
