package com.cnu.mentoring.vineet.cdp.oo.codeTask;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.*;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds.AdamsHouse;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds.ChrisHouse;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds.MagHouse;
import org.apache.log4j.Logger;

public class Main {
	private static final Logger LOGGER = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		AdamsHouse adam = new AdamsHouse();
		adam.setAppliances(new Light(true),new Fan(true),new AirConditioner(true), new Heater(true));
		
		ChrisHouse chris = new ChrisHouse();
		chris.setAppliances(new Light(false),new Fan(true),new AirConditioner(false), new Heater(false));
		
		MagHouse mag = new MagHouse();
		mag.setAppliances(new Light(true),new Fan(false),new AirConditioner(true), new Heater(true));
		
		LOGGER.info("\n Adam's House");
		ApplianceUtils.sortAppliancesByPowerUsage(adam.getAllAppliances());
		LOGGER.info("Total PowerBill of Adam's House is " + adam.getTotalPowerBill(adam.getAllAppliances()));
		
		LOGGER.info("\n Chris's House");
		ApplianceUtils.sortAppliancesByPowerUsage(chris.getAllAppliances());
		LOGGER.info("Total PowerBill of Chris House is " + chris.getTotalPowerBill(chris.getAllAppliances()));
		
		LOGGER.info("\n Mag's House");
		ApplianceUtils.sortAppliancesByPowerUsage(mag.getAllAppliances());
		LOGGER.info("Total PowerBill of Mag's House is " + mag.getTotalPowerBill(mag.getAllAppliances()));
	}
}
