package com.cnu.mentoring.vineet.cdp.oo.codeTask;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.IAppliance;
import org.apache.log4j.Logger;

import java.util.List;

public class SortAppliancesByPowerUsage implements SortAppliance{

    private static final Logger LOGGER = Logger.getLogger(UtilityMethods.class);

    @Override
    public void sortAppliances(List<IAppliance> appliances) {
        appliances.sort((a1, a2) -> (int) (a2.getPowerUsage() - a1.getPowerUsage()));
        appliances.forEach(appliance -> LOGGER.info(appliance.getClass().getSimpleName()));
    }
}
