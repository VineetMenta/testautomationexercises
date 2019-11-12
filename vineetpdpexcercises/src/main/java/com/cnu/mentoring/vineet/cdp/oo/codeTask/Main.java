package com.cnu.mentoring.vineet.cdp.oo.codeTask;

import org.apache.log4j.Logger;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.AirConditioner;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.ApplianceUtils;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Appliances;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Fan;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Heater;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.Light;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds.AdamsHouse;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds.ChrisHouse;
import com.cnu.mentoring.vineet.cdp.oo.codeTask.HouseHolds.MagHouse;

public class Main {
	private static final Logger LOGGER = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		AdamsHouse adam = new AdamsHouse();
		adam.setAppliances(new Light(10,5),new Fan(8, 6),new AirConditioner(5, 3), new Heater(3, 2));
		
		ChrisHouse chris = new ChrisHouse();
		chris.setAppliances(new Light(20,15),new Fan(15, 11),new AirConditioner(10, 5), new Heater(5, 2));
		
		MagHouse mag = new MagHouse();
		mag.setAppliances(new Light(30,15),new Fan(20, 10),new AirConditioner(10, 8), new Heater(10, 5));
		
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
