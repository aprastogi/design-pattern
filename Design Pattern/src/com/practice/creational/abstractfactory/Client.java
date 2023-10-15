package com.practice.creational.abstractfactory;

import com.practice.creational.abstractfactory.components.buttons.Button;
import com.practice.creational.abstractfactory.components.dropdowns.Dropdown;
import com.practice.creational.abstractfactory.components.menus.Menu;
import com.practice.creational.abstractfactory.model.Color;
import com.practice.creational.abstractfactory.model.Font;
import com.practice.creational.abstractfactory.model.Shape;

public class Client {

    public static void main(String[] args) {

        // For Android
        Flutter flutter = new Flutter(Platform.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();

        flutter.setColor(Color.BLUE);
        flutter.setShape(Shape.SQUARE);
        flutter.setFont(Font.SMALL);

        Button button = uiFactory.createButton();
        Dropdown dropdown = uiFactory.createDropdown();
        Menu menu = uiFactory.createMenu();

        button.displayButton();
        dropdown.displayDropdown();
        menu.displayMenu();
        System.out.println();

        // For Windows
        flutter = new Flutter(Platform.WINDOWS);
        uiFactory = flutter.createUIFactory();

        button = uiFactory.createButton();
        dropdown = uiFactory.createDropdown();
        menu = uiFactory.createMenu();

        button.displayButton();
        dropdown.displayDropdown();
        menu.displayMenu();
        System.out.println();

        // For IOS
        flutter = new Flutter(Platform.IOS);
        uiFactory = flutter.createUIFactory();

        button = uiFactory.createButton();
        dropdown = uiFactory.createDropdown();
        menu = uiFactory.createMenu();

        button.displayButton();
        dropdown.displayDropdown();
        menu.displayMenu();
    }
}
