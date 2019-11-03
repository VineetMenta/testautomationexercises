package com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds;

import java.util.List;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Appliances;

public interface IHouseHold {
	public List<Appliances> getAllAppliances();
	public void setAppliances(Appliances... appliances);
}
