package com.cnu.mentoring.vineet.cdp.designpatterns.factorypattern;

public class InsuranceFactory {

    public static Insurance getInsuranceType(String typeOfInsurance){
        typeOfInsurance = typeOfInsurance.toLowerCase();
        switch(typeOfInsurance){
            case "health":
                return new HealthInsurance();
            case "car":
                return new CarInsurance();
            case "bike" :
                return new BikeInsurance();
            default:
                System.out.println("Try again with a correct plan");
                break;
        }
        return null;
    }
}
