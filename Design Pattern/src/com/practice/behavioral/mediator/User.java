package com.practice.behavioral.mediator;

public class User {

    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public void send(String message) {
        System.out.println(this.name + " : Sending Message : " + message);
        chatMediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(this.name + " : Received Message: " + message);
    }
}
