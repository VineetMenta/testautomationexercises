package com.cnu.mentoring.vineet.cdp.designpatterns.decoratorpattern;

public class PageCreator {

    public static void main(String[] args){
        AbstractPage page = new MobilePage();
        page = new LinksWidget(page);
        page = new NewsWidget(page);
        page = new CalendarWidget(page);
        System.out.println(page.getPageDescription());
        System.out.println("The cost of the requested page is " + page.getPageCost());
    }
}
