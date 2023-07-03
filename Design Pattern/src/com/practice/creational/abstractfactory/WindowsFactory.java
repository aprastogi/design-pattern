package com.practice.creational.abstractfactory;

public class WindowsFactory implements AbstractFactory{

	@Override
	public OS getInstance() {
		return new Windows();
	}

}
