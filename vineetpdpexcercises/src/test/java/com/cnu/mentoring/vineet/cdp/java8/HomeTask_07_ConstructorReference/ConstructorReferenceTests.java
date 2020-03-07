package com.cnu.mentoring.vineet.cdp.java8.HomeTask_07_ConstructorReference;

import com.cnu.mentoring.vineet.cdp.java8.pojos.Product;
import com.cnu.mentoring.vineet.cdp.java8.pojos.ProductDetails;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ConstructorReferenceTests {

    private static final Logger LOGGER = Logger.getLogger(ConstructorReferenceTests.class);

    @Test
    public void testConstructorReference(){
        ProductDetails product = Product::new;
        LOGGER.info(product.getProduct(1000, "Headphones", "Electronics", "C"));
    }
}
