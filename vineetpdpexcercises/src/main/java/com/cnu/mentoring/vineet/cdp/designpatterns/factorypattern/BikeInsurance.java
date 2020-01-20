package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;

public class BikeInsurance extends Insurance {
    @Override
    void setRateOfPlan() {
        rateOfPlan = 4.56;
    }

    @Override
    void setBaseRate() {
        baseRate = 80;
    }
}
