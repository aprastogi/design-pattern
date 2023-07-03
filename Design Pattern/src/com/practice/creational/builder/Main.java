package com.practice.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person p = Person.Builder().name("Apoorv").address("Shahjahanpur").build();
        System.out.println(p);
    }
}
