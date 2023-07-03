package com.practice.behavioral.chainofresponsibility;

public class VP extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getAmount() > 1500 && request.getRequestType() == RequestType.PURCHASE){
            System.out.println("VP can approve this request with this much amount");
        }
        else{
            succcesor.handleRequest(request);
        }
    }
}
