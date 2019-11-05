package com.cnu.mentoring.vineet.cdp.oo.codeTask.codereview;

public abstract class Appliance {
    public String name = "";
    private boolean state = false;
    private int consumption = 0;

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getConsumption() {
        return consumption;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
