package com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.ApplianceUtils;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.IAppliance;

import java.util.List;

public interface HouseHold{
	int costPerUnit = 20;

	List<IAppliance> getAllAppliances();
	void setAppliances(IAppliance... appliances);

	default double getTotalPowerBill(List<IAppliance> appliances) {
		return ApplianceUtils.getTotalPowerUsage(appliances) * costPerUnit;
	}
}
