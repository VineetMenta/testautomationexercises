package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

import org.apache.log4j.Logger;

import java.util.List;

public class ApplianceUtils {
	
	private static final Logger LOGGER = Logger.getLogger(ApplianceUtils.class);
	
	public static void sortAppliancesByPowerUsage(List<IAppliance> appliances) {

		appliances.sort((a1, a2) -> (int) (a2.getPowerUsage() - a1.getPowerUsage()));

		appliances.forEach(appliance -> LOGGER.info(appliance.getClass().getSimpleName()));
	}

	public static double getTotalPowerUsage (List<IAppliance> appliances) {
		double powerUsage = 0;
		for (IAppliance appliance: appliances) {
			if(appliance.getState()) {
				powerUsage = powerUsage + appliance.getEffectivePowerConsumedByAppliance();
			}
		}
		return powerUsage;
	}

}
