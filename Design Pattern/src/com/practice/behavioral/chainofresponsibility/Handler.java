package com.practice.behavioral.chainofresponsibility;

public abstract class Handler {
    protected Handler next;

    public abstract void handleRequest(Request request);

    public abstract void setNext(Handler next);

}
