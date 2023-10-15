package com.practice.creational.abstractfactory;

import com.practice.creational.abstractfactory.components.buttons.IOSButton;
import com.practice.creational.abstractfactory.components.dropdowns.IOSDropdown;
import com.practice.creational.abstractfactory.components.menus.IOSMenu;

public class IOSUIFactory implements UIFactory {

    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDropdown() {
        return new IOSDropdown();
    }
}
