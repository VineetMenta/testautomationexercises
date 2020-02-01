package com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.IAppliance;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagHouse implements HouseHold {
	private static final Logger LOGGER = Logger.getLogger(MagHouse.class);
	private List<IAppliance> MagHouse;

	@Override
	public List<IAppliance> getAllAppliances() {
		try {
			if (this.MagHouse == null) {
				throw new Exception();
			} else {
				return this.MagHouse;
			}
		} catch (Exception e) {
			LOGGER.fatal(" Your household can't have no appliances");
		}
		return null;
	}

	@Override
	public void setAppliances(IAppliance... appliances) {
		this.MagHouse = new ArrayList<IAppliance>(Arrays.asList(appliances));
	}

}