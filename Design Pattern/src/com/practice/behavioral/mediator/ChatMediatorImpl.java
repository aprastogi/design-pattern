package com.practice.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatMediatorImpl implements ChatMediator{

    private final Map<User, ChatClient> userChatClientMap;

    public ChatMediatorImpl() {
        this.userChatClientMap = new HashMap<>();
    }

    @Override
    public void sendMessage(User user, String message) {
        for(Map.Entry<User,ChatClient> entry : userChatClientMap.entrySet()){
            if(entry.getKey() != user){
                entry.getValue().receive(user, message, entry.getKey());
            }
        }
    }

    @Override
    public void register(User user, ChatClient chatClient) {
        userChatClientMap.put(user, chatClient);
    }
}
