package com.cnu.mentoring.vineet.cdp.oo.codeTask.codereview;

public class ApplicationLogic {
    public static int calculatePowerConsumption(Home home) {
        int totalConsumption = 0;
        for (Appliance appliance : home.getApplianceList()) {
            if (appliance.isState()) {
                totalConsumption = totalConsumption + appliance.getConsumption();
            }
        }
        return totalConsumption;
    }
}
