package com.practice.behavioral.chainofresponsibility;

public class CEO extends  Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve everything");
    }
}
