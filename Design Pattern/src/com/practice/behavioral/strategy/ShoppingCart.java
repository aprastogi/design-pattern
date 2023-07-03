package com.practice.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;
    Strategy paymentStrategy;

    public ShoppingCart(Strategy strategy){
        items = new ArrayList<>();
        this.paymentStrategy = strategy;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
