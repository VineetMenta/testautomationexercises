package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;

public class BikeInsurance extends Insurance {

    public BikeInsurance(){
        setBaseRate();
        setRateOfPlan();
    }

    void setRateOfPlan() {
        rateOfPlan = 4.56;
    }

    void setBaseRate() {
        baseRate = 80;
    }
}
