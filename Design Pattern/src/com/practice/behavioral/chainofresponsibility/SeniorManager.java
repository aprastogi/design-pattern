package com.practice.behavioral.chainofresponsibility;

public class SeniorManager extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (RequestType.PERMISSION == request.getType()) {
            System.out.println("Senior Manager can approve permissions");
        } else {
            System.out.println("Senior Manager cannot approve " + request.getType());
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
}
