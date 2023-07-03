package com.practice.creational.abstractfactory;


public class FactoryMain {

	public static void main(String[] args) {
		OSFactory osf = new OSFactory();
		OS instance = osf.getInstance(new WindowsFactory());
		instance.spec();
	}

}
