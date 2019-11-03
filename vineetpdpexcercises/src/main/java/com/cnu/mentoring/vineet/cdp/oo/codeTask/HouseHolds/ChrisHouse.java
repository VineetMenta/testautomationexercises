package com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Appliances;

public class ChrisHouse implements IHouseHold {

	private static final Logger LOGGER = Logger.getLogger(ChrisHouse.class);
	private List<Appliances> ChrisHouse;

	@Override
	public List<Appliances> getAllAppliances() {
		try {
			if (this.ChrisHouse == null) {
				throw new Exception();
			} else {
				return this.ChrisHouse;
			}
		} catch (Exception e) {
			LOGGER.fatal(" Your household can't have no appliances ");
		}
		return null;
	}

	@Override
	public void setAppliances(Appliances... appliances) {
		this.ChrisHouse = new ArrayList<Appliances>(Arrays.asList(appliances));
	}

}
