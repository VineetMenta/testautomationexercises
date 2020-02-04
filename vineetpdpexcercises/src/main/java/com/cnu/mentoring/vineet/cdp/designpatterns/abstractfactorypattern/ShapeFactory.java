package com.cnu.mentoring.vineet.cdp.designpatterns.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        else{
            return null;
        }
    }
}
