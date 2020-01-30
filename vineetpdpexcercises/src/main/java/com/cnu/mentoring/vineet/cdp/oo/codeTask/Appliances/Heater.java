package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

import org.apache.log4j.Logger;

public class Heater extends Appliances implements IAppliance {
	
	private static final Logger LOGGER = Logger.getLogger(Heater.class);
	private static final double powerUsage = 140;

	public Heater(int totalNumberOfApplicances, int numberOfAppliancesSwitchedOn) {
		totalNumberOfAppliances = totalNumberOfApplicances;
		try {
			if (numberOfAppliancesSwitchedOn < totalNumberOfApplicances)
				this.numberOfAppliancesSwitchedOn = numberOfAppliancesSwitchedOn;
			else
				throw new Exception();
		} catch (Exception e) {
			LOGGER.fatal("Number of appliances switched on cannot be more than total number of appliances");
		}
	}

	public double getPowerUsageOfAppliance() {
		return powerUsage;
	}
}
