package com.cnu.mentoring.vineet.cdp.designpatterns.abstractfactorypattern;

import org.apache.log4j.Logger;

public class Runner {

    private static final Logger LOGGER = Logger.getLogger(Runner.class);

    public static void main (String[] args){
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        AbstractFactory straightShapeFactory = FactoryProducer.getFactory(false);

        Shape roundedRectangle = roundedShapeFactory.getShape("rectangle");
        Shape roundedSquare = roundedShapeFactory.getShape("square");

        Shape straightRectangle = straightShapeFactory.getShape("rectangle");
        Shape straightSquare = straightShapeFactory.getShape("square");

        LOGGER.info(roundedRectangle.draw());
        LOGGER.info(roundedSquare.draw());
        LOGGER.info(straightRectangle.draw());
        LOGGER.info(straightSquare.draw());
    }
}
