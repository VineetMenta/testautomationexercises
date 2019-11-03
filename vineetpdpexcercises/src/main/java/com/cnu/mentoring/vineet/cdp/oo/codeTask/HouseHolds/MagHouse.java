package com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Appliances;

public class MagHouse implements IHouseHold {
	private static final Logger LOGGER = Logger.getLogger(MagHouse.class);
	private List<Appliances> MagHouse;

	@Override
	public List<Appliances> getAllAppliances() {
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
	public void setAppliances(Appliances... appliances) {
		this.MagHouse = new ArrayList<Appliances>(Arrays.asList(appliances));
	}

}