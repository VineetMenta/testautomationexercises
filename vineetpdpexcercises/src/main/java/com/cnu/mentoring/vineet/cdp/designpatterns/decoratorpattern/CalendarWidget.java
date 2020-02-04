package com.cnu.mentoring.vineet.cdp.designpatterns.decoratorpattern;

public class CalendarWidget extends AbstractPage{

    private AbstractPage page;

    public CalendarWidget(AbstractPage page){
        this.page = page;
        this.pageDescription = page.getPageDescription() + "with Calendar Widget";
    }

    @Override
    public int getPageCost() {
        return page.getPageCost() + 150;
    }
}
