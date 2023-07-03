package com.practice.behavioral.iterator;

public class IteratorMain {

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.push("a.com");
        browserHistory.push("b.com");
        browserHistory.push("c.com");

        System.out.println("Deleted : " + browserHistory.pop());

        Iterator<String> iterator = new ListIterator(browserHistory);
        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
