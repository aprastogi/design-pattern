package com.practice.creational.abstractfactory;

public class OSFactory {
    public OS getInstance(AbstractFactory af) {
    	  return af.getInstance();
      }
}
