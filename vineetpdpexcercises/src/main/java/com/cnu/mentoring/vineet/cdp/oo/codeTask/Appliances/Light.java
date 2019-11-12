package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

import org.apache.log4j.Logger;

public class Light extends Appliances{
	
	private static final Logger LOGGER = Logger.getLogger(Light.class);
	private static final double powerUsage = 40;

	public Light(int totalNumberOfApplicances, int numberOfAppliancesSwitchedOn) {
		this.totalNumberOfAppliances = totalNumberOfApplicances;
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