package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;

public class CarInsurance extends Insurance{
    @Override
    void setRateOfPlan() {
        rateOfPlan = 5.67;
    }

    @Override
    void setBaseRate() {
        baseRate = 100;
    }
}
