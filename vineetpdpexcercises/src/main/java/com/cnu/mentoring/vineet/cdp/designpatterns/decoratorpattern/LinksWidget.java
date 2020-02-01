package com.cnu.mentoring.vineet.cdp.designpatterns.decoratorpattern;

public class LinksWidget extends AbstractPage {

    private AbstractPage page;

    public LinksWidget(AbstractPage page){
        this.page = page;
        this.pageDescription = page.getPageDescription() + "with Links Widget";
    }

    @Override
    public int getPageCost() {
        return page.getPageCost() + 120;
    }
}
