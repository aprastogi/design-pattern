package com.practice.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private final Map<String,Item> items = new HashMap<>();

    public  Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try{
            item = (Item)(items.get(type)).clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    public void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 Hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basic book");
        book.setPrice(1.55);
        book.setNumberOfPages(450);
        items.put("Book", book);
    }

}
