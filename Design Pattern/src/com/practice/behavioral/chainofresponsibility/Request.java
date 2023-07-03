package com.practice.behavioral.chainofresponsibility;

public class Request {

    private RequestType requestType;
    private float amount;

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
