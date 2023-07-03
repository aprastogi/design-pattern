package com.practice.behavioral.mediator;

public class ChatClient {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User apoorv = new User(chatMediator, "apoorv");
        User ishan  = new User(chatMediator, "ishan");
        User kedar  = new User(chatMediator, "kedar");

        chatMediator.registerUser(apoorv);
        chatMediator.registerUser(ishan);
        chatMediator.registerUser(kedar);

        apoorv.send("Good Morning Folks");

    }
}
