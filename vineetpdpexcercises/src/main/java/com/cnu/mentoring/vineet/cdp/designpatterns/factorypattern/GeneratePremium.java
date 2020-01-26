package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;


import org.apache.log4j.Logger;

public class GeneratePremium {

    public static final Logger LOGGER = Logger.getLogger(GeneratePremium.class);

    public static void main(String[] args) {
       Insurance insurance = InsuranceFactory.getInsuranceType("Car");
       int durationOfPlan = 3;
       LOGGER.info("The premium for " + insurance.getClass().getSimpleName() + " for " + durationOfPlan +" years is " + insurance.calculatePremium(durationOfPlan));
    }
}
