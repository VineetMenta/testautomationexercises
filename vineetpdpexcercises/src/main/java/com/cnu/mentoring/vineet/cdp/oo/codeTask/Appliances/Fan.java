package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

import org.apache.log4j.Logger;

public class Fan extends Appliances implements IAppliance {

	private double powerUsagePerAppliance = 15;
	private int totalNumberOfAppliances;
	private int numberOfAppliancesSwitchedOn;
	private static final Logger LOGGER = Logger.getLogger(Fan.class);

	public Fan(int totalNumberOfApplicances, int numberOfAppliancesSwitchedOn) {
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

	@Override
	public double powerUsage() {
		return this.powerUsagePerAppliance * numberOfAppliancesSwitchedOn;
	}

	@Override
	public int totalNumberOfAppliances() {
		return this.totalNumberOfAppliances;
	}

	@Override
	public int numberOfAppliancesSwitchedOn() {
		return this.numberOfAppliancesSwitchedOn;
	}

}
