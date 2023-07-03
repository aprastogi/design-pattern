package com.practice.structural.flyweight;

public class Tester implements Employee{

    private final String job;
    private String skill;

    public Tester(){
        this.job = "Test the issue";
    }
    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Tester with skill : " + this.skill + " with job: " + job);
    }
}
