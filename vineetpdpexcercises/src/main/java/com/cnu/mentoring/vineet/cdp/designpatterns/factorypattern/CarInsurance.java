package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;

public class CarInsurance extends Insurance{

    public CarInsurance(){
        setBaseRate();
        setRateOfPlan();
    }

    void setRateOfPlan() {
        rateOfPlan = 5.67;
    }

    void setBaseRate() {
        baseRate = 100;
    }
}
