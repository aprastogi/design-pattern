package com.practice.behavioral.mediator;

public class MainApp {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();

        ChatClient client1 = new ChatClient(chatMediator);
        ChatClient client2 = new ChatClient(chatMediator);
        ChatClient client3 = new ChatClient(chatMediator);
        ChatClient client4 = new ChatClient(chatMediator);

        User apoorv = new User( "apoorv");
        User ishan  = new User("ishan");
        User kedar  = new User("kedar");
        User sajal  = new User("sajal");

        client1.register(apoorv);
        client2.register(ishan);
        client3.register(kedar);
        client4.register(sajal);

        client1.send(apoorv, "Hello All !!!");
    }
}
