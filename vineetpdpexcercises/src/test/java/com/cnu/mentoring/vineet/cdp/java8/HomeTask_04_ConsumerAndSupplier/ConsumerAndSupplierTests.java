package com.cnu.mentoring.vineet.cdp.java8.HomeTask_04_ConsumerAndSupplier;

import com.cnu.mentoring.vineet.cdp.java8.pojos.Product;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplierTests {

    private static final Logger LOGGER = Logger.getLogger(ConsumerAndSupplierTests.class);

    List<Product> products;

    Consumer<String> printStrategy = (printLocation) -> {
        if (printLocation.equalsIgnoreCase("file"))
            LOGGER.info("Printing on file");
        else if (printLocation.isEmpty())
            LOGGER.info("Printing on console");
    };

    Consumer<List<Product>> premiumProducts = (products) -> products
            .forEach((product) -> {
                if (product.getPrice() > 1000) {
                    product.setGrade("Premium");
                }
                LOGGER.info(product);
            });

    Consumer<List<Product>> namePremiumProducts = (products) -> products
            .forEach((product) -> {
                if (product.getPrice() > 3000) {
                    product.setName("*" + product.getName());
                }
                LOGGER.info(product);
            });

    Consumer<List<Product>> nameAndTestPremiumProducts = (products) -> products
            .forEach((product) -> {
                if (product.getPrice() > 3000) {
                    product.setGrade("Premium");
                    product.setName("*" + product.getName());
                    LOGGER.info(product);
                }
            });
    Supplier<Product> getRandomProduct = () -> this.products.get((int) (Math.random() * products.size()));

    Supplier<Integer> getOTP = () -> (int) (Math.random() * 100000);

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
    public void testProductConsumers() {
        printStrategy.accept("file");
    }

    @Test
    public void testPremiumProducts() {
        premiumProducts.accept(products);
    }

    @Test
    public void namePremiumProducts() {
        namePremiumProducts.accept(products);
    }

    @Test
    public void nameAndTestPremiumProducts() {
        nameAndTestPremiumProducts.accept(products);
    }

    @Test
    public void getRandomProduct() {
        LOGGER.info(getRandomProduct.get());
    }

    @Test
    public void getRandomOTP() {
        LOGGER.info(getOTP.get());
    }
}
