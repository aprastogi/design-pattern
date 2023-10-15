package com.practice.creational.abstractfactory;

import com.practice.creational.abstractfactory.components.buttons.WindowsButton;
import com.practice.creational.abstractfactory.components.dropdowns.WindowsDropdown;
import com.practice.creational.abstractfactory.components.menus.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsMenu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public WindowsDropdown createDropdown() {
        return new WindowsDropdown();
    }
}
