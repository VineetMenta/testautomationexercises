package com.cnu.mentoring.vineet.cdp.java8.HomeTask_08_Streams;

import com.cnu.mentoring.vineet.cdp.java8.pojos.Product;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsTests {

    private static final Logger LOGGER = Logger.getLogger(StreamsTests.class);

    List<Product> products;

    Predicate<Product> priceGreaterThanThousand = product -> product.getPrice()>1000;
    Predicate<Product> isProductElectronic = product -> product.getCategory().equalsIgnoreCase("Electronics");

    @BeforeClass
    public void initializeProductsList() {
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
    }

    @Test
    public void getProductsWithPrice(){
        LOGGER.info(products.stream().filter(priceGreaterThanThousand).collect(Collectors.toList()));
    }

    @Test
    public void getProductsWithCategory(){
        LOGGER.info(products.stream().filter(isProductElectronic).collect(Collectors.toList()));
    }

    @Test
    public void mapProductsWithCategoryAndPrice(){
        LOGGER.info(products.stream().filter(isProductElectronic.and(priceGreaterThanThousand)).map(product -> product.getName().toUpperCase()).collect(Collectors.toList()));
    }

    @Test
    public void getCountOfElectronicProducts(){
        LOGGER.info(products.stream().filter(isProductElectronic).count());
    }
}
