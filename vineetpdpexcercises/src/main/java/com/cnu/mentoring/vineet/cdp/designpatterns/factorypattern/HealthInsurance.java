package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;

public class HealthInsurance extends Insurance{

    public HealthInsurance(){
        setBaseRate();
        setRateOfPlan();
    }

    public void setRateOfPlan() {
        rateOfPlan = 7.56;
    }

    public void setBaseRate() {
        baseRate = 120;
    }
}
