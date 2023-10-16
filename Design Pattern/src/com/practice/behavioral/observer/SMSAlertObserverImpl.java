package com.practice.behavioral.observer;

public class SMSAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public SMSAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Message sent to " + userName + " with msg " + msg);
    }
}
