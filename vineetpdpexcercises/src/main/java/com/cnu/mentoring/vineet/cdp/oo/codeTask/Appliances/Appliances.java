package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

public abstract class Appliances implements IAppliance {
	
	public int totalNumberOfAppliances;
	public int numberOfAppliancesSwitchedOn;
	
	public abstract double getPowerUsageOfAppliance();

	public double powerUsage() {
		return  getPowerUsageOfAppliance() * numberOfAppliancesSwitchedOn;
	}

	public int totalNumberOfAppliances() {
		return this.totalNumberOfAppliances;
	}

	public int numberOfAppliancesSwitchedOn() {
		return this.numberOfAppliancesSwitchedOn;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " : " + this.powerUsage();
	}
}
