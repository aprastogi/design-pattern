package com.practice.behavioral.chainofresponsibility;

public class Request {
    private final String name;
    private final RequestType type;

    public Request(String name, RequestType type) {
        this.name = name;
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }
}
