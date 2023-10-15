package com.practice.behavioral.iterator;


public class ListIterator<T> implements Iterator<T>{

    BrowserHistory<T> browserHistory;
    int index;

    public ListIterator(BrowserHistory<T> browserHistory){
        this.browserHistory = browserHistory;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < browserHistory.getUrlList().size();
    }

    @Override
    public T next() {
        return browserHistory.getUrlList().get(index++);
    }
}
