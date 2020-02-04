package com.cnu.mentoring.vineet.cdp.oo.codeTask;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.AirConditioner;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Fan;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Heater;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Light;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        House adamsHouse = new House();
        adamsHouse.addAppliance(new Light(true),
                new Fan(true),
                new AirConditioner(true),
                new Heater(true));

        House chrisHouse = new House();
        chrisHouse.addAppliance(new Light(false),
                new Fan(true),
                new AirConditioner(false),
                new Heater(false));

        House magHouse = new House();
        magHouse.addAppliance(new Light(true),
                new Fan(false),
                new AirConditioner(true),
                new Heater(true));

        LOGGER.info("\n Adam's House");

        SortAppliance sortAppliance = new SortAppliancesByPowerUsage();
        sortAppliance.sortAppliances(adamsHouse.getApplianceList());

        double powerConsumption = UtilityMethods.calculatePowerConsumption(adamsHouse);
        double powerBill = UtilityMethods.calculatePowerBill(powerConsumption);
        LOGGER.info("Total PowerBill of Adam's House is " + powerBill);

        LOGGER.info("\n chrisHouse's House");
        sortAppliance = new SortAppliancesByPowerUsage();
        sortAppliance.sortAppliances(chrisHouse.getApplianceList());
        powerConsumption = UtilityMethods.calculatePowerConsumption(chrisHouse);
        powerBill = UtilityMethods.calculatePowerBill(powerConsumption);
        LOGGER.info("Total PowerBill of Adam's House is " + powerBill);
        LOGGER.info("\n chrisHouse's House");

        sortAppliance = new SortAppliancesByPowerUsage();
        sortAppliance.sortAppliances(magHouse.getApplianceList());
        powerConsumption = UtilityMethods.calculatePowerConsumption(magHouse);
        powerBill = UtilityMethods.calculatePowerBill(powerConsumption);
        LOGGER.info("Total PowerBill of Adam's House is " + powerBill);
    }
}
