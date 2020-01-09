package com.cnu.mentoring.vineet.cdp.designpatterns.decorator;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        pizza = new Cheese(pizza);
        pizza = new Sauce(pizza);
        System.out.println(pizza.getCost() + "\n" + pizza.getDescription());
    }
}
