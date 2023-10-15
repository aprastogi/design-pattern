package com.practice.creational.abstractfactory;

import com.practice.creational.abstractfactory.components.buttons.Button;
import com.practice.creational.abstractfactory.components.dropdowns.Dropdown;
import com.practice.creational.abstractfactory.components.menus.Menu;

public interface UIFactory {

    Button createButton();

    Menu createMenu();

    Dropdown createDropdown();

}
