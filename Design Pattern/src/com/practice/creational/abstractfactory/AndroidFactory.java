package com.practice.creational.abstractfactory;

public class AndroidFactory implements AbstractFactory{

	@Override
	public OS getInstance() {
		return new Android();
	}

}
