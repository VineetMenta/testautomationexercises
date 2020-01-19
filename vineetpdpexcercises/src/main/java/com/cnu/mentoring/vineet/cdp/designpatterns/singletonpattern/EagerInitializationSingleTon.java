package com.cnu.mentoring.vineet.cdp.designpatterns.singletonpattern;

import org.apache.log4j.Logger;

public class EagerInitializationSingleTon {

    private static EagerInitializationSingleTon singleTon = new EagerInitializationSingleTon();
    private static final Logger LOGGER = Logger.getLogger(EagerInitializationSingleTon.class);

    private EagerInitializationSingleTon(){
    }

    public static EagerInitializationSingleTon getInstanceOfSingleTon(){
        return singleTon;
    }
}
