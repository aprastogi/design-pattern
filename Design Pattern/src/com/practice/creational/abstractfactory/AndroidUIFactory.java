package com.practice.creational.abstractfactory;

import com.practice.creational.abstractfactory.components.buttons.AndroidButton;
import com.practice.creational.abstractfactory.components.dropdowns.AndroidDropdown;
import com.practice.creational.abstractfactory.components.menus.AndroidMenu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
