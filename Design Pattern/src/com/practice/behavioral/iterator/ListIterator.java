package com.practice.behavioral.iterator;


public class ListIterator implements Iterator<String>{

    BrowserHistory browserHistory;
    int index;

    public ListIterator(BrowserHistory browserHistory){
        this.browserHistory = browserHistory;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < browserHistory.getUrlList().size();
    }

    @Override
    public String next() {
        return browserHistory.getUrlList().get(index++);
    }
}
