package com.cnu.mentoring.vineet.cdp.designpatterns.singletonpattern;


import org.apache.log4j.Logger;

public class LazyInitializationSingleTon {

    private static LazyInitializationSingleTon singleTon;
    private static final Logger LOGGER = Logger.getLogger(LazyInitializationSingleTon.class);

    private LazyInitializationSingleTon() {
        LOGGER.info("Object is created");
    }

    public static final LazyInitializationSingleTon getInstanceOfSingleton(){
        if(singleTon == null)
            singleTon = new LazyInitializationSingleTon();
        return singleTon;
    }
}
