package com.practice.behavioral.chainofresponsibility;

public abstract class Handler {

    protected Handler succcesor;

    public void setSucccesor(Handler succcesor){
        this.succcesor = succcesor;
    }

    public abstract void handleRequest(Request request);

}
