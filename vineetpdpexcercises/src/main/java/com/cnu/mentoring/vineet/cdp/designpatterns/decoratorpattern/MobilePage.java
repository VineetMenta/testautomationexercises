package com.cnu.mentoring.vineet.cdp.designpatterns.decoratorpattern;

public class MobilePage extends AbstractPage{

    public MobilePage(){
        this.pageDescription = "This is a Mobile Page ";
    }

    @Override
    public int getPageCost() {
        return 250;
    }
}
