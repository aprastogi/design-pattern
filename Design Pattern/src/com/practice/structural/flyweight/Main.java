package com.practice.structural.flyweight;

import java.util.Random;

public class Main {
    private static final String[] employeeType = {"Developer", "Tester"};
    private static final String[] skills = {"Java", "C#", "Python"};

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Employee e = EmployeeFactory.getEmployee(getRandEmployee());
            e.assignSkill(getRandSkill());
            e.task();
        }
    }

    private static String getRandSkill() {
        Random random = new Random();
        int randInt = random.nextInt(skills.length);
        return skills[randInt];
    }

    private static String getRandEmployee() {
        Random random = new Random();
        int randInt = random.nextInt(employeeType.length);
        return employeeType[randInt];
    }
}
