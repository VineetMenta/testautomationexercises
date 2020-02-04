package com.cnu.mentoring.vineet.cdp.designpatterns.abstractfactorypattern;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        }
        else if (shape.equalsIgnoreCase("square")){
            return new RoundedSquare();
        }
        else {
            return null;
        }
    }
}
