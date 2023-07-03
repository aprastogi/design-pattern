package com.practice.structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Created new row int employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted row with employee id " + employeeId);
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data from the Db");
        return new Employee();
    }
}
