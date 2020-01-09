package com.cnu.mentoring.vineet.cdp.designpatterns.decorator;

public class Cheese extends Pizza {

    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
        this.description = pizza.getDescription() + " + Cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 15;
    }
}
