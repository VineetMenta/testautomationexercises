package com.cnu.mentoring.vineet.cdp.designpatterns.decoratorpattern;

public abstract class AbstractPage {

    String pageDescription = "This is a Abstract Page";

    public abstract int getPageCost();

    public String getPageDescription(){
        return this.pageDescription;
    }
}
