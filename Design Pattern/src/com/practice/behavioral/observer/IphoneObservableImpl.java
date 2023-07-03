package com.practice.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    List<NotificationAlertObserver> observersList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observersList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stock) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount = stockCount + stock;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
