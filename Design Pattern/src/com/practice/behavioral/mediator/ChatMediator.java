package com.practice.behavioral.mediator;

public interface ChatMediator {
    void sendMessage(User user, String message);

    void register(User user, ChatClient chatClient);
}
