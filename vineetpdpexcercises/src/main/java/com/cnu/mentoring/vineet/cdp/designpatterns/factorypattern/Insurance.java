package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;

public abstract class Insurance {
    protected double rateOfPlan;
    protected double baseRate;
    abstract void setRateOfPlan();
    abstract void setBaseRate();
    public double calculatePremium(int duration){
        System.out.println(baseRate + " " + rateOfPlan);
        return baseRate + rateOfPlan * duration;
    }
}
