package com.practice.structural.proxy;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equals("Admin")){
            employeeDao.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("Admin")){
            employeeDao.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client.equals("Admin") || client.equals("User")){
            return employeeDao.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}
