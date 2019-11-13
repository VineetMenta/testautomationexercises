package com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds;

import java.util.List;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Appliances;

public interface HouseHold{
	public int costPerUnit = 20;
	public List<Appliances> getAllAppliances();
	public void setAppliances(Appliances... appliances);
	public default double getTotalPowerBill(List<Appliances> appliances) {
		double powerBill = 0; 
		for(Appliances appliance: appliances){
			powerBill += appliance.powerUsage()*costPerUnit;
		}
		return powerBill;
	}
}
