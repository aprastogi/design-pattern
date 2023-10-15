package com.practice.behavioral.mediator;

public class ChatClient {

    ChatMediator chatMediator;

    public ChatClient(ChatMediator chatMediator){
        this.chatMediator = chatMediator;
    }

    public void register(User user){
        chatMediator.register(user, this);
    }

    public void send(User user, String message){
        chatMediator.sendMessage(user, message);
    }

    public void receive(User sender, String message, User user) {
        System.out.println("[" + sender.name + "] " + user.name + " : Received Message: " + message);
    }
}
