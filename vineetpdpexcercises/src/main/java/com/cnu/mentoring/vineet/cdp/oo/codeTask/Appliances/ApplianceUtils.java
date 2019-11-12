package com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

public class ApplianceUtils {
	
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

	public static double getTotalPowerUsage (List<Appliances> appliances) {
		double powerUsage = 0;
		for (int appCount = 0; appCount < appliances.size(); appCount++) {
			powerUsage = powerUsage + appliances.get(appCount).powerUsage();
		}
		return powerUsage;
	}

}
