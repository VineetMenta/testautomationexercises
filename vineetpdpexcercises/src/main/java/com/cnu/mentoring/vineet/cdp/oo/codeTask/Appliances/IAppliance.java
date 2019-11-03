package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

public interface IAppliance extends CostPerUnit {
	public double powerUsage();
	public int totalNumberOfAppliances();
	public int numberOfAppliancesSwitchedOn();
}
