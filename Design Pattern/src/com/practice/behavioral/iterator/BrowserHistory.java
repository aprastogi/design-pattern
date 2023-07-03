package com.practice.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    private final List<String> urlList;

    public BrowserHistory() {
        this.urlList = new ArrayList<>();
    }

    public void push(String url){
        this.urlList.add(url);
    }

    public String pop(){
        return urlList.remove(urlList.size() -1);
    }

    public List<String> getUrlList(){
        return this.urlList;
    }
}
