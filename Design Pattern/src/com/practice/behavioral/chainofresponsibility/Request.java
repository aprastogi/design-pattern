package com.practice.behavioral.chainofresponsibility;

public class Request {

    private final RequestType requestType;
    private final float amount;

    public Request(RequestType requestType, float amount){
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return this.requestType;
    }

    public float getAmount(){
        return this.amount;
    }
}
