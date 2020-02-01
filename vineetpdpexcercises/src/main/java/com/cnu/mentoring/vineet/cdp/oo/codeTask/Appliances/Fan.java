package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

public class Fan implements IAppliance {

	private static final double powerUsage = 40;
	private boolean isSwitchedOn;

	public Fan(boolean isSwitchedOn){
		this.isSwitchedOn = isSwitchedOn;
	}

	public boolean getState() {
		return isSwitchedOn;
	}

	public double getPowerUsage() {
		return powerUsage;
	}

	public double getEffectivePowerConsumedByAppliance() {
		if(isSwitchedOn){
			return powerUsage;
		}
		else {
			return 0;
		}
	}
}
