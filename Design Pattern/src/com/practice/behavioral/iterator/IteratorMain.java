package com.practice.behavioral.iterator;

public class IteratorMain {

    public static void main(String[] args) {
        BrowserHistory<String> browserHistory = new BrowserHistory<>();
        browserHistory.push("a.com");
        browserHistory.push("b.com");
        browserHistory.push("c.com");

        System.out.println("Deleted : " + browserHistory.pop());

        Iterator<String> iterator = browserHistory.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
