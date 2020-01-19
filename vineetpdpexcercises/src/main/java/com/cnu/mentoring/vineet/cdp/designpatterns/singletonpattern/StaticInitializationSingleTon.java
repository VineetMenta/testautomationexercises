package com.cnu.mentoring.vineet.cdp.designpatterns.singletonpattern;

import org.apache.log4j.Logger;

public class StaticInitializationSingleTon {

    private static StaticInitializationSingleTon singleTon;
    private static final Logger LOGGER = Logger.getLogger(StaticInitializationSingleTon.class);

    static{
        try {
            singleTon = new StaticInitializationSingleTon();
        }catch (Exception ex){
            LOGGER.info("Caught Exception while creating the object");
        }
    }

    private StaticInitializationSingleTon(){
        LOGGER.info("Object is created");
    }

    public static final StaticInitializationSingleTon getInstanceOfSingleTon(){
        return singleTon;
    }
}
