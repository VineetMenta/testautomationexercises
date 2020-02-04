package com.cnu.mentoring.vineet.cdp.designpatterns.decoratorpattern;

public class TopicsWidget extends AbstractPage {

    private AbstractPage page;

    public TopicsWidget(AbstractPage page){
        this.page = page;
        this.pageDescription = page.getPageDescription() + "with Topics Widget";
    }

    @Override
    public int getPageCost() {
        return page.getPageCost() + 250;
    }
}

