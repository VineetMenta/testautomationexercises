package com.cnu.mentoring.vineet.cdp.designpatterns.singletonpattern;

import org.apache.log4j.Logger;

public class ThreadSafeSingleton {

    private static final Logger LOGGER = Logger.getLogger(ThreadSafeSingleton.class);
    private static ThreadSafeSingleton singleton;

    private ThreadSafeSingleton(){
        LOGGER.info("Object is created");
    }

    public static final ThreadSafeSingleton getInstanceOfSingleton(){
        synchronized(ThreadSafeSingleton.class){
            if(singleton == null)
                singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }
}
