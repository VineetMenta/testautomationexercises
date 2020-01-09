package com.cnu.mentoring.vineet.cdp.designpatterns.decorator;

public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        this.description = "Thick Crust Pizza";
    }

    @Override
    public int getCost() {
        return 15;
    }
}
