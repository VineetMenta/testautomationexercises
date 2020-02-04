package com.cnu.mentoring.vineet.cdp.oo.codeTask;

import com.cnu.mentoring.vineet.cdp.oo.codeTask.Appliances.IAppliance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class House {

    List<IAppliance> applianceList;

    public House() {
        this.applianceList = new ArrayList<>();
    }

    public List<IAppliance> getApplianceList() {
        return applianceList;
    }

    public void addAppliance(IAppliance appliance) {
        applianceList.add(appliance);
    }

    public void addAppliance(List<IAppliance> appliances) {
        applianceList.addAll(appliances);
    }

    public void addAppliance(IAppliance... appliances) {
        applianceList.addAll(new ArrayList<IAppliance>(Arrays.asList(appliances)));
    }
}
