package com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Appliances;

public class AdamsHouse implements HouseHold {

	private static final Logger LOGGER = Logger.getLogger(AdamsHouse.class);
	private List<Appliances> AdamsHouse;

	@Override
	public List<Appliances> getAllAppliances() {
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
	public void setAppliances(Appliances... appliances) {
		this.AdamsHouse = new ArrayList<Appliances>(Arrays.asList(appliances));
	}
}