package com.practice.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    List<Item> items;

    public CartService(){
        items = new ArrayList<>();
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
}
