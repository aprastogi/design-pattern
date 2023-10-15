package com.practice.behavioral.chainofresponsibility;

public class ClientApp {
    public static void main(String[] args) {
        Handler manager = new Manager();
        Handler seniorManager = new SeniorManager();
        Handler director = new Director();

        manager.setNext(seniorManager);
        seniorManager.setNext(director);

        System.out.println("=====================================");
        Request request = new Request("Telephone Bill",RequestType.BILL);
        manager.handleRequest(request);
        System.out.println("=====================================");

        request = new Request("Github Permission",RequestType.PERMISSION);
        manager.handleRequest(request);
        System.out.println("=====================================");

        request = new Request("Hire New Candidate",RequestType.HIRE);
        manager.handleRequest(request);
        System.out.println("=====================================");

        request = new Request("Acquire a new company",RequestType.ACQUIRE_COMPANY);
        manager.handleRequest(request);
        System.out.println("=====================================");

    }
}
