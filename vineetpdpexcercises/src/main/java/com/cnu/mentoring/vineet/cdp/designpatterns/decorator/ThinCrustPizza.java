package com.cnu.mentoring.vineet.cdp.designpatterns.decorator;

public class ThinCrustPizza extends Pizza {


    public ThinCrustPizza() {
        description = "Thin Crust Pizza";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
