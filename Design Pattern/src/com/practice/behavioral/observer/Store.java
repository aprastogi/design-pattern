package com.practice.behavioral.observer;

public class Store {

    public static void main(String[] args) {

        StockObservable iphone = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphone);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com", iphone);
        NotificationAlertObserver observer3 = new SMSAlertObserverImpl("abc_username", iphone);

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);

        iphone.setStockCount(10);
    }
}
