package com.cnu.mentoring.vineet.cdp.java8.HomeTask_Utils;

import com.cnu.mentoring.vineet.cdp.java8.pojos.Product;
import com.cnu.mentoring.vineet.cdp.java8.pojos.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductAndResponseUtils {

    public static List<Product> getProductsWithCondition(List<Product> products, Predicate<Product> predicate) {
        return products.stream().filter(predicate).collect(Collectors.toList());
    }

    public static List<Product> getProductsWithCondition(List<Product> products, Function<Product, Product> function) {
        List<Product> output = new ArrayList<>();
        for (Product product : products) {
            if (function.apply(product) != null) {
                output.add(function.apply(product));
            }
        }
        return output;
    }

    public static List<Response> getResponsesWithCondition(List<Response> responses, Predicate<Response> predicate) {
        return responses.stream().filter(predicate).collect(Collectors.toList());
    }

    public static int costOfProductsWithFunction(List<Product> products, Function<Product, Integer> function) {
        int costOfProducts = 0;
        for (Product product : products) {
            costOfProducts += function.apply(product);
        }
        return costOfProducts;
    }
}
