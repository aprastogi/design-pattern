package com.practice.behavioral.template;

public class TemplateDemo {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();
        System.out.println();
        Game football = new Football();
        football.play();
    }
}
