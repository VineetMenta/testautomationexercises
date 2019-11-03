package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;

public abstract class Appliances implements IAppliance {
	private static final Logger LOGGER = Logger.getLogger(Appliances.class);

	public static void sortAppliancesByPowerUsage(List<Appliances> appliances) {
		Collections.sort(appliances, new Comparator<Appliances>() {

			@Override
			public int compare(Appliances a1, Appliances a2) {
				return (int) (a2.powerUsage() - a1.powerUsage());
			}
		});
		for (int apps = 0; apps < appliances.size(); apps++) {
			LOGGER.info(appliances.get(apps).toString());
		}
	}

	public static void totalPowerBill(List<Appliances> appliances) {
		double totalCost = 0;
		for (int appCount = 0; appCount < appliances.size(); appCount++) {
			totalCost = totalCost + appliances.get(appCount).powerUsage() * costPerUnit;
		}
		LOGGER.info("Total power bill is " + totalCost);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " : " + this.powerUsage();
	}
}
