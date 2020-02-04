package com.cnu.mentoring.vineet.cdp.oo.codeTask;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.IAppliance;
import org.apache.log4j.Logger;

import java.util.List;

public class UtilityMethods {

    private static final Logger LOGGER = Logger.getLogger(UtilityMethods.class);

    public static double getTotalPowerUsage(List<IAppliance> appliances) {
        double powerUsage = 0;
        for (IAppliance appliance : appliances) {
            if (appliance.getState()) {
                powerUsage = powerUsage + appliance.getEffectivePowerConsumedByAppliance();
            }
        }
        return powerUsage;
    }

    public static double calculatePowerConsumption(House house) {
        List<IAppliance> appliances = house.getApplianceList();
        double powerUsage = 0;
        for (IAppliance appliance : appliances) {
            if (appliance.getState()) {
                powerUsage = powerUsage + appliance.getEffectivePowerConsumedByAppliance();
            }
        }
        return powerUsage;
    }

    public static double calculatePowerBill(double powerconsumption) {
        return powerconsumption * 20;
    }
}
