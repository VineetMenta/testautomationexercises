package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;

public class HealthInsurance extends Insurance{
    @Override
    void setRateOfPlan() {
        rateOfPlan = 7.56;
    }

    @Override
    void setBaseRate() {
        baseRate = 120;
    }
}
