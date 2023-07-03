package com.practice.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

    private final List<User> userList;

    public ChatMediatorImpl() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u : userList){
            if(u != user){
                u.receive(message);
            }
        }
    }

    @Override
    public void registerUser(User user) {
        userList.add(user);
    }
}
