package com.cnu.mentoring.vineet.cdp.designpatterns.singletonpattern;

import org.apache.log4j.Logger;

public class Runner {

    private static final Logger LOGGER = Logger.getLogger(Runner.class);

    public static void main(String[] args) {
        EagerInitializationSingleTon eagerOne = EagerInitializationSingleTon.getInstanceOfSingleTon();
        EagerInitializationSingleTon eagerTwo = EagerInitializationSingleTon.getInstanceOfSingleTon();
        LOGGER.info(eagerOne.hashCode() + " " + eagerTwo.hashCode());
        LazyInitializationSingleTon lazyOne = LazyInitializationSingleTon.getInstanceOfSingleton();
        LazyInitializationSingleTon lazyTwo = LazyInitializationSingleTon.getInstanceOfSingleton();
        LOGGER.info(lazyOne.hashCode() + " " + lazyTwo.hashCode());
        StaticInitializationSingleTon staticOne = StaticInitializationSingleTon.getInstanceOfSingleTon();
        StaticInitializationSingleTon staticTwo = StaticInitializationSingleTon.getInstanceOfSingleTon();
        LOGGER.info(staticOne.hashCode() + " " + staticTwo.hashCode());
        ThreadSafeSingleton threadOne = ThreadSafeSingleton.getInstanceOfSingleton();
        ThreadSafeSingleton threadTwo = ThreadSafeSingleton.getInstanceOfSingleton();
        LOGGER.info(threadOne.hashCode() + " " + threadTwo.hashCode());
    }
}
