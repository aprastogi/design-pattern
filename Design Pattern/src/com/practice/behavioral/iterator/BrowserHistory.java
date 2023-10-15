package com.practice.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory<T> {

    private final List<T> urlList;

    public BrowserHistory() {
        this.urlList = new ArrayList<>();
    }

    public void push(T url){
        this.urlList.add(url);
    }

    public T pop(){
        return urlList.remove(urlList.size() -1);
    }

    public List<T> getUrlList(){
        return this.urlList;
    }
}
