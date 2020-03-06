package com.cnu.mentoring.vineet.cdp.java8.HomeTask_05_BiFunction;

import com.cnu.mentoring.vineet.cdp.java8.pojos.Product;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionTests {

    private static final Logger LOGGER = Logger.getLogger(BiFunctionTests.class);

    Map<Product, Integer> cart = new HashMap<>();

    BiFunction<Integer, String, Product> productAttributes = Product::new;

    @BeforeClass
    public void initialize(){
        Product productOne = new Product(100, "Pencils", "Stationery", "A");
        Product productTwo = new Product(120, "Cups", "Crockery", "B");
        Product productThree = new Product(1500, "Phone", "Electronics", "A");
        Product productFour = new Product(150, "USB Cable", "Electronics", "B");

        cart.put(productOne, 3);
        cart.put(productTwo, 5);
        cart.put(productThree, 1);
        cart.put(productFour, 6);
    }

    @Test
    public void testBifunction(){
        LOGGER.info(productAttributes.apply(1200,"Bottle"));
    }

    @Test
    public void getCartPrice(){
        int result = 0;
        for (Product product: cart.keySet()) {
            result += product.getPrice() * cart.get(product);
        }
        LOGGER.info(result);
    }
}
