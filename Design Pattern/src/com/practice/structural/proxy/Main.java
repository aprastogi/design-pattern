package com.practice.structural.proxy;

public class Main {

    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("Admin", new Employee());
            employeeDao.create("User", new Employee());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
