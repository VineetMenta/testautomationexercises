package com.cnu.mentoring.vineet.cdp.java8.HomeTask_02_Predicates;

import com.cnu.mentoring.vineet.cdp.java8.pojos.Product;
import com.cnu.mentoring.vineet.cdp.java8.pojos.Response;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductAndResponseUtils {

    public static List<Product> getProductsWithCondition(List<Product> products, Predicate<Product> predicate){
        return products.stream().filter(predicate).collect(Collectors.toList());
    }

    public static List<Response> getResponsesWithCondition(List<Response> responses, Predicate<Response> predicate){
        return responses.stream().filter(predicate).collect(Collectors.toList());
    }
}
