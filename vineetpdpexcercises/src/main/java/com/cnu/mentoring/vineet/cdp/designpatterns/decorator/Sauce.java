package com.cnu.mentoring.vineet.cdp.designpatterns.decorator;

public class Sauce extends Pizza {

    private Pizza pizza;

    public Sauce(Pizza pizza) {
        this.pizza = pizza;
        this.description = pizza.getDescription() + " + Sauce";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 25;
    }
}
