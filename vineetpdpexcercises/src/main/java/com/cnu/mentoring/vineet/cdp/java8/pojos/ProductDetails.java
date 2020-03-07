package com.cnu.mentoring.vineet.cdp.java8.pojos;

@FunctionalInterface
public interface ProductDetails {
    Product getProduct(int price, String name, String category, String grade);
}
