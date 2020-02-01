package com.cnu.mentoring.vineet.cdp.designpatterns.decoratorpattern;

public class NewsWidget extends AbstractPage{

    private AbstractPage page;

    public NewsWidget(AbstractPage page){
        this.page = page;
        this.pageDescription = page.getPageDescription() + "with News Widget";
    }

    @Override
    public int getPageCost() {
        return page.getPageCost() + 100;
    }
}
