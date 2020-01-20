package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;


import org.apache.log4j.Logger;

public class GeneratePremium {

    public static final Logger LOGGER = Logger.getLogger(GeneratePremium.class);

    public static void main(String[] args) {
       Insurance insurance = InsuranceFactory.getInsuranceType("Health");
       LOGGER.info("The premium for Heath insurance for 3 years is " + insurance.calculatePremium( 3));
    }
}
