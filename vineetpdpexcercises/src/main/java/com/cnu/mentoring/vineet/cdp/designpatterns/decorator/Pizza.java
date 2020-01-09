package com.cnu.mentoring.vineet.cdp.designpatterns.decorator;

public abstract class Pizza {

    String description = "unknown description";

    public abstract int getCost();

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return (new StringBuilder().append("Description :")
                .append(getDescription())
                .append("\ncost :")
                .append(getCost())).toString();
    }
}
