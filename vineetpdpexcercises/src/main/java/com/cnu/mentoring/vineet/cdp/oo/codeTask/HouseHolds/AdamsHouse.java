package com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.IAppliance;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdamsHouse implements HouseHold {

	private static final Logger LOGGER = Logger.getLogger(AdamsHouse.class);
	private List<IAppliance> AdamsHouse;

	public List<IAppliance> getAllAppliances() {
		try {
			if (this.AdamsHouse == null) {
				throw new Exception();
			} else {
				return this.AdamsHouse;
			}
		} catch (Exception e) {
			LOGGER.fatal(" Your household can't have no appliances ");
		}
		return null;
	}

	@Override
	public void setAppliances(IAppliance... appliances) {
		this.AdamsHouse = new ArrayList<IAppliance>(Arrays.asList(appliances));
	}
}