package com.practice.creational.abstractfactory;

public class IOSFactory implements AbstractFactory {

	@Override
	public OS getInstance() {
		return new IOS();
	}

}
