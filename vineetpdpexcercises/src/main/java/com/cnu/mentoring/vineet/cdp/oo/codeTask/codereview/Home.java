package com.cnu.mentoring.vineet.cdp.oo.codeTask.codereview;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Appliance> applianceList = new ArrayList<Appliance>();

    public List<Appliance> getApplianceList() {
        return applianceList;
    }

    public void add(Appliance appliance) {
        applianceList.add(appliance);
    }
}
