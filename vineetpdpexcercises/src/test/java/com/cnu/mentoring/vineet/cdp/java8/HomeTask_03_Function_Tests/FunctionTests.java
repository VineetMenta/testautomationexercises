package com.cnu.mentoring.vineet.cdp.java8.HomeTask_03_Function_Tests;

import com.cnu.mentoring.vineet.cdp.java8.HomeTask_Utils.ProductAndResponseUtils;
import com.cnu.mentoring.vineet.cdp.java8.pojos.Product;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTests {

    private static final Logger LOGGER = Logger.getLogger(FunctionTests.class);

    List<Product> products;

    Function<Product, Integer> costOfAllProduct = Product::getPrice;
    Function<Product, Integer> costOfProductsGreaterThanThousand = product -> product.getPrice() > 1000 ? product.getPrice() : 0;
    Function<Product, Integer> costOfAllElectronicProducts = product ->
            product.getCategory().equalsIgnoreCase("Electronics") ? product.getPrice() : 0;
    Function<Product, Product> costOfAllElectronicProductsGreaterThanThousand = product -> product.getPrice() > 1000
            && product.getCategory().equalsIgnoreCase("Electronics")
            ? product : null;

    @DataProvider(name = "productFunctions")
    public Object[][] provideFunctions(){
        return new Object[][]{{costOfAllProduct},
                {costOfProductsGreaterThanThousand},
                {costOfAllElectronicProducts}};
    }

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

    @Test(dataProvider = "productFunctions")
    public void getPricesBasedOnFunction(Function<Product, Integer> function){
        LOGGER.info(ProductAndResponseUtils.costOfProductsWithFunction(products, function));
    }

    @Test
    public void getProductsByFunction(){
        LOGGER.info(ProductAndResponseUtils.getProductsWithCondition(products, costOfAllElectronicProductsGreaterThanThousand));
    }
}
