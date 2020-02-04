package com.cnu.mentoring.vineet.cdp.designpatterns.decoratorpattern;

public class DesktopPage extends AbstractPage{

    public DesktopPage(){
        this.pageDescription = "This is a Desktop Page ";
    }

    @Override
    public int getPageCost() {
        return 200;
    }
}
