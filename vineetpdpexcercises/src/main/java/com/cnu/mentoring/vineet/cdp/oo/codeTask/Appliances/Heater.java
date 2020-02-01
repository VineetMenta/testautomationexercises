package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

public class Heater implements IAppliance {

	private static final double powerUsage = 140;
	private boolean isSwitchedOn;

	public Heater(boolean isSwitchedOn){
		this.isSwitchedOn = isSwitchedOn;
	}

	public boolean getState() {
		return isSwitchedOn;
	}

	public double getPowerUsage() {
		return powerUsage;
	}

	public double getEffectivePowerConsumedByAppliance() {
		if(isSwitchedOn) {
			return powerUsage;
		}
		else {
			return 0;
		}
	}
}
