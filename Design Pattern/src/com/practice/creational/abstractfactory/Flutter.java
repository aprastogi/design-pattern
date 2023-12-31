package com.practice.creational.abstractfactory;

import com.practice.creational.abstractfactory.model.Color;
import com.practice.creational.abstractfactory.model.Font;
import com.practice.creational.abstractfactory.model.Shape;

public class Flutter {

    private final Platform platform;

    public Flutter(Platform platform) {
        this.platform = platform;
    }

    public void setColor(Color color) {
        System.out.println("Color set for display: " + color.name());
    }

    public void setShape(Shape shape) {
        System.out.println("Shape set for display: " + shape.name());
    }

    public void setFont(Font font) {
        System.out.println("Font set for display: " + font.name());
    }


    public UIFactory createUIFactory() {
        return UIFactoryFactory.getUIFactoryByName(platform.getValue());
    }

}
